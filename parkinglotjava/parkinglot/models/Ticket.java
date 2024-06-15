package parkinglotjava.parkinglot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    String number;

    Date entryTime;

    Vehicle vehicle;

    Slot parkingSlots;

    Gate genratedGate;

    TicketStatus status;

    // getters and setters 
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Slot getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(Slot parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public Gate getGenratedGate() {
        return genratedGate;
    }
    
    public void setGenratedGate(Gate genratedGate) {
        this.genratedGate = genratedGate;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

}
