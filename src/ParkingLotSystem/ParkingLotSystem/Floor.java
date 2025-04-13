package ParkingLotSystem.ParkingLotSystem;

import ParkingLotSystem.Tickets.BikeTicket;
import ParkingLotSystem.Tickets.CarTicket;
import ParkingLotSystem.Tickets.OtherVehicleTicket;

public class Floor {
    private int floorNumber;
    private final CarTicket[] carCapacity = new CarTicket[2];
    private final BikeTicket[] bikeCapacity = new BikeTicket[2];
    private final OtherVehicleTicket[] otherVehicleCapacity = new OtherVehicleTicket[2];

    Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
    public CarTicket[] getCarCapacity() {
        return carCapacity;
    }

    public BikeTicket[] getBikeCapacity(){
        return bikeCapacity;
    }

    public OtherVehicleTicket[] getOtherVehicleCapacity() {
        return otherVehicleCapacity;
    }
}
