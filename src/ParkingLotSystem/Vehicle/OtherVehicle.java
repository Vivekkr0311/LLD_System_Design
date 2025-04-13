package ParkingLotSystem.Vehicle;

public class OtherVehicle extends Vehicle {

    private static final double OTHER_VEHICLE_PARKING_RATE = 15.0;
    OtherVehicle(String licensePlate, String vehicleType) {
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
        return OTHER_VEHICLE_PARKING_RATE;
    }
}