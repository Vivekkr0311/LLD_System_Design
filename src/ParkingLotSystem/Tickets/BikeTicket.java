package ParkingLotSystem.Tickets;

import ParkingLotSystem.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class BikeTicket extends Ticket{
    public BikeTicket(Vehicle vehicle) {
        super(vehicle);

        if (!vehicle.getVehicleType().equalsIgnoreCase("bike")) {
            throw new RuntimeException("Vehicle is not a bike");
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
        return 3 * vehicle.getParkingRate();
    }
}
