package parkinglotjava.parkinglot.DTO;

import parkinglotjava.parkinglot.models.VehicleType;

public class IssueTicketRequest {
    
    private String vehicleNo;

    private long gateId;

    private String ownerName;

    private VehicleType vehicleType;

    // getters and setters

    public String getVehicleNo() {
        return this.vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public long getGateId() {
        return this.gateId;
    }

    public void setGateId(long gateId) {
        this.gateId = gateId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }


}
