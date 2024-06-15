package parkinglotjava.parkinglot.DTO;

import parkinglotjava.parkinglot.models.Slot;
import parkinglotjava.parkinglot.models.Vehicle;

import java.util.Date;

public class IssueTicketResponse {

    private String ticketNumber;

    private Date entryTime;

    private Slot slot;

    private Vehicle vehicle;

    // Getters and Setters for ticketNumber, entryTime, slot, vehicle go here

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
}
