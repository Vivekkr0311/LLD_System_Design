package ParkingLotSystem.Tickets;

import ParkingLotSystem.Vehicle.Vehicle;

import java.time.LocalDateTime;

public class OtherVehicleTicket extends Ticket{
    public OtherVehicleTicket(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public Vehicle getVehicleDetails() {
        return vehicle;
    }

    @Override
    public double calculateFee() {
        LocalDateTime exitTime = LocalDateTime.now();
        long hours = java.time.Duration.between(entryTime, exitTime).toHours();
        return 1 * vehicle.getParkingRate();
    }
}
