package parkinglotjava.parkinglot.models;

import java.util.List;

public class Floor {

    private List<Slot> parkingslotsList;

    int floorNumber;

    FloorStatus floorStatus;

    List<VehicleType> allowedVehicleTypes;

    public List<Slot> getParkingslotsList() {
        return parkingslotsList;
    }

    public void setParkingslotsList(List<Slot> parkingslotsList) {
        this.parkingslotsList = parkingslotsList;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public FloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(FloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public List<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public void setAllowedVehicleTypes(List<VehicleType> allowedVehicleTypes) {
        this.allowedVehicleTypes = allowedVehicleTypes;
    }
    
}
