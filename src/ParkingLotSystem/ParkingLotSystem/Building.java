package ParkingLotSystem.ParkingLotSystem;

public class Building {
    private Floor[] floors;
    private EntryGate entryGate;
    private ExitGate exitGate;

    public Building() {
        floors = new Floor[2];
        for(int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(i + 1);
        }
        entryGate = new EntryGate(this);
        exitGate = new ExitGate(this);
    }

    public Floor[] getFloors() {
        return floors;
    }

    public EntryGate entryGate() {
        return entryGate;
    }

    public ExitGate getExitGate() {
        return exitGate;
    }
}
