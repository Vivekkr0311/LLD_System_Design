package ParkingLotSystem.Tickets;

import ParkingLotSystem.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class CarTicket extends Ticket {
    public CarTicket(Vehicle vehicle) {
        super(vehicle);

        if (!vehicle.getVehicleType().equalsIgnoreCase("car")) {
            throw new RuntimeException("Vehicle is not a car");
        }
    }

    @Override
    public Vehicle getVehicleDetails() {
        return vehicle;
    }

    @Override
    public double calculateFee() {
        LocalDateTime exitTime = LocalDateTime.now();
        long hours = java.time.Duration.between(entryTime, exitTime).toHours();
        return 2 * vehicle.getParkingRate();
    }
}
