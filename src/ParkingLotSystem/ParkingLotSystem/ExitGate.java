package ParkingLotSystem.ParkingLotSystem;

import ParkingLotSystem.Tickets.BikeTicket;
import ParkingLotSystem.Tickets.CarTicket;
import ParkingLotSystem.Tickets.OtherVehicleTicket;
import ParkingLotSystem.Tickets.Ticket;

import java.util.Scanner;

public class ExitGate extends Gate {
    private Building building;
    private Scanner scanner = new Scanner(System.in);

    ExitGate(Building building) {
        this.building = building;
    }

    public void exitVehicle() {
        System.out.println("Enter your license plate number: ");
        String licensePlateNumber = scanner.nextLine();

        Ticket foundTicket = findTicket(licensePlateNumber);
        if (foundTicket == null) {
            throw new RuntimeException("You did not parked your vehicle in this parking lot");
        }


        double fare = calculateFare(foundTicket);
        System.out.println("Your parking fee is: " + fare);
        System.out.println("Thank you for using our parking lot. Have a nice day!");
    }

    private Ticket findTicket(String licensePlateNumber) {
        Ticket ticket = null;
        Floor[] floors = building.getFloors();

        for (int i = 0; i < floors.length; i++) {
            BikeTicket[] bikeTickets = floors[i].getBikeCapacity();
            CarTicket[] carTickets = floors[i].getCarCapacity();
            OtherVehicleTicket[] otherVehicleTickets = floors[i].getOtherVehicleCapacity();

            for (int j = 0; j < bikeTickets.length; j++) {
                if (bikeTickets[i] != null && bikeTickets[i].getVehicleDetails().getLicensePlate().equalsIgnoreCase(licensePlateNumber)) {
                    Ticket tempTicket = bikeTickets[i];
                    bikeTickets[i] = null;
                    return tempTicket;
                }
            }

            for (int j = 0; j < carTickets.length; j++) {
                if (carTickets[i] != null && carTickets[i].getVehicleDetails().getLicensePlate().equalsIgnoreCase(licensePlateNumber)) {
                    Ticket tempTicket = carTickets[i];
                    carTickets[i] = null;
                    return tempTicket;
                }
            }

            for (int j = 0; j < otherVehicleTickets.length; j++) {
                if (otherVehicleTickets[i] != null && otherVehicleTickets[i].getVehicleDetails().getLicensePlate().equalsIgnoreCase(licensePlateNumber)) {
                    Ticket tempTicket = otherVehicleTickets[i];
                    otherVehicleTickets[i] = null;
                    return tempTicket;
                }
            }
        }
        return ticket;
    }

    private double calculateFare(Ticket ticket) {
        return ticket.calculateFee();
    }
}
