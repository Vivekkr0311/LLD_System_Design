package ParkingLotSystem.Vehicle;

/**
 * VehicleFactory is a factory class that creates instances of different types of vehicles.
 * It uses the Factory Method design pattern to create objects based on the vehicle type.
 */
public class VehicleFactory {
    /**
     * Creates a vehicle based on the provided license plate and vehicle type.
     *
     * @param licensePlate the license plate of the vehicle
     * @param vehicleType  the type of the vehicle (e.g., "car", "bike")
     * @return an instance of Vehicle
     */
    public static Vehicle createVehicle(String licensePlate, String vehicleType) {
        return switch (vehicleType.toLowerCase()) {
            case "car" -> new Car(licensePlate, vehicleType);
            case "bike" -> new Bike(licensePlate, vehicleType);
            default -> new OtherVehicle(licensePlate, vehicleType);
        };
    }
}