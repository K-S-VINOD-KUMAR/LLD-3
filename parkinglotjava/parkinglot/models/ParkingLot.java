package parkinglotjava.parkinglot.models;

import java.util.List;

public class ParkingLot {

    private List<Floor> parkingFloor;
    
    private List<Gate> gates;

    private String name;

    private String address;

    List<VehicleType> allowedVehicles;

    int capacity;

    private ParkingLotStatus status;

    private SlotAssignmentStratergyEnum slotAssignmentStratergy;

    // GETTERS AND SETTERS

    public List<Floor> getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(List<Floor> parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<VehicleType> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<VehicleType> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public SlotAssignmentStratergyEnum getSlotAssignmentStratergy() {
        return slotAssignmentStratergy;
    }

    public void setSlotAssignmentStratergy(SlotAssignmentStratergyEnum slotAssignmentStratergy) {
        this.slotAssignmentStratergy = slotAssignmentStratergy;
    }

}
