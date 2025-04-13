package ParkingLotSystem;

import ParkingLotSystem.ParkingLotSystem.Building;
import ParkingLotSystem.ParkingLotSystem.EntryGate;
import ParkingLotSystem.ParkingLotSystem.ExitGate;

public class Main {
    public static void main(String[] args) {
        Building parkingLot = new Building();
        EntryGate entryGate = parkingLot.entryGate();
        ExitGate exitGate = parkingLot.getExitGate();

        entryGate.registerVehicle();
        entryGate.getAllBookedSlots();

        exitGate.exitVehicle();

        entryGate.getAllBookedSlots();
    }
}