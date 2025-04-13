package ParkingLotSystem.ParkingLotSystem;

import ParkingLotSystem.Tickets.BikeTicket;
import ParkingLotSystem.Tickets.CarTicket;
import ParkingLotSystem.Tickets.OtherVehicleTicket;
import ParkingLotSystem.Tickets.Ticket;
import ParkingLotSystem.Vehicle.Vehicle;
import ParkingLotSystem.Vehicle.VehicleFactory;

import java.util.Scanner;

public class EntryGate extends Gate {
    private Scanner scanner = new Scanner(System.in);
    private VehicleFactory vehicleFactory;
    private Ticket ticket;
    private Building building;

    public EntryGate(Building building) {
        this.building = building;
        this.vehicleFactory = new VehicleFactory();
    }

    public void registerVehicle() {
        System.out.println("Enter license plate number:");
        String licensePlate = scanner.nextLine();

        System.out.println("Enter vehicle type (car, bike, other):");
        String type = scanner.nextLine();

        Vehicle vehicle = vehicleFactory.createVehicle(licensePlate, type);
        System.out.println("Vehicle created: " + vehicle.getVehicleType() + " " + vehicle.getLicensePlate());

        bookParkingSpot(vehicle);
    }

    public void createTicket(Vehicle vehicle) {
        switch (vehicle.getVehicleType().toLowerCase()) {
            case "car":
                CarTicket carTicket = new CarTicket(vehicle);
                ticket = carTicket;
                break;
            case "bike":
                BikeTicket bikeTicket = new BikeTicket(vehicle);
                ticket = bikeTicket;
                break;
            default:
                OtherVehicleTicket otherVehicleTicket = new OtherVehicleTicket(vehicle);
                ticket = otherVehicleTicket;
                break;
        }
    }

    public void bookParkingSpot(Vehicle vehicle) {
        // Logic to book a parking spot based on vehicle type
        Floor[] floors = building.getFloors();
        for (int i = 0; i < floors.length; i++) {
            int spotIndex = findParkingSpotInTheFloor(floors[i], vehicle);
            if (spotIndex != -1) {
                break;
            }
        }
    }

    private int findParkingSpotInTheFloor(Floor floor, Vehicle vehicle) {
        String vehicleType = vehicle.getVehicleType();

        switch (vehicleType.toLowerCase()) {
            case "car":
                CarTicket[] carSpot = floor.getCarCapacity();

                for (int i = 0; i < carSpot.length; i++) {
                    if (carSpot[i] == null) {
                        createTicket(vehicle);
                        carSpot[i] = (CarTicket) ticket;
                        return i;
                    }
                }
                break;
            case "bike":
                BikeTicket[] bikeSpot = floor.getBikeCapacity();

                for (int i = 0; i < bikeSpot.length; i++) {
                    if (bikeSpot[i] == null) {
                        createTicket(vehicle);
                        bikeSpot[i] = (BikeTicket) ticket;
                        return i;
                    }
                }
                break;
            default:
                OtherVehicleTicket[] otherVehicleSpot = floor.getOtherVehicleCapacity();

                for (int i = 0; i < otherVehicleSpot.length; i++) {
                    if (otherVehicleSpot[i] == null) {
                        createTicket(vehicle);
                        otherVehicleSpot[i] = (OtherVehicleTicket) ticket;
                        return i;
                    }
                }
                break;
        }
        return -1;
    }

    public void getAllBookedSlots() {
        Floor[] floors = building.getFloors();

        for (int eachFloors = 0; eachFloors < floors.length; eachFloors++) {
            CarTicket[] carTickets = floors[eachFloors].getCarCapacity();
            BikeTicket[] bikeTickets = floors[eachFloors].getBikeCapacity();
            OtherVehicleTicket[] otherVehicleTickets = floors[eachFloors].getOtherVehicleCapacity();
            System.out.println("<================================Floor " + (eachFloors + 1) + ": =======================>");
            System.out.println("Car spots: ");
            for (int i = 0; i < carTickets.length; i++) {
                if (carTickets[i] != null) {
                    System.out.print("|Spot " + i + ": " + carTickets[i].getVehicleDetails().getLicensePlate() + "|");
                } else {
                    System.out.print("|Spot " + i + ": Empty|");
                }
            }
            System.out.println();

            System.out.println("Bike spots: ");
            for (int i = 0; i < bikeTickets.length; i++) {
                if (bikeTickets[i] != null) {
                    System.out.print("|Spot " + i + ": " + bikeTickets[i].getVehicleDetails().getLicensePlate() + "|");
                } else {
                    System.out.print("|Spot " + i + ": Empty|");
                }
            }
            System.out.println();

            System.out.println("Other Vehicle spots: ");
            for (int i = 0; i < otherVehicleTickets.length; i++) {
                if (otherVehicleTickets[i] != null) {
                    System.out.print("|Spot " + i + ": " + otherVehicleTickets[i].getVehicleDetails().getLicensePlate() + "|");
                } else {
                    System.out.print("|Spot " + i + ": Empty|");
                }
            }

            System.out.println("\n");
        }
    }
}
