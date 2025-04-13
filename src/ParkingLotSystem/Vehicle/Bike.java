package ParkingLotSystem.Vehicle;

public class Bike extends Vehicle {

    private static final double BIKE_PARKING_RATE = 5.0;

    Bike(String licensePlate, String vehicleType) {
        super(licensePlate, vehicleType);
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public double getParkingRate() {
        return BIKE_PARKING_RATE;
    }
}