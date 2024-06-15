package parkinglotjava.parkinglot.models;

public class Slot {
    private int slotNumber;
    VehicleType vehicleType;
    SlotStatus parkingSlotStatus;
    Floor parkingFloor;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(SlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public Floor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(Floor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

}
