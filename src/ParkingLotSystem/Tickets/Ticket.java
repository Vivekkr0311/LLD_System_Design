package ParkingLotSystem.Tickets;

import ParkingLotSystem.Vehicle.Vehicle;

import java.time.LocalDateTime;

public abstract class Ticket {
    protected Vehicle vehicle;
    protected LocalDateTime entryTime;
    protected LocalDateTime exitTime;

    Ticket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public abstract Vehicle getVehicleDetails();
    public abstract double calculateFee();
}