package ParkingLotSystem.Vehicle;

public abstract class Vehicle {
    protected String licensePlate;
    protected String vehicleType;

    Vehicle(String licensePlate, String vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public abstract String getLicensePlate();

    public abstract String getVehicleType();

    public abstract double getParkingRate();
}
