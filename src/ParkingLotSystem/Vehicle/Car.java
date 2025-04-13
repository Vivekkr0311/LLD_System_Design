package ParkingLotSystem.Vehicle;

public class Car extends Vehicle {

    private static final double CAR_PARKING_RATE = 10.0;

    Car(String licensePlate, String vehicleType) {
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
        return CAR_PARKING_RATE;
    }
}