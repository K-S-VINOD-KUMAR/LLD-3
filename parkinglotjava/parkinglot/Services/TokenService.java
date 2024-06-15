package parkinglotjava.parkinglot.Services;

import java.util.Date;
import java.util.Optional;

import parkinglotjava.parkinglot.models.Gate;
import parkinglotjava.parkinglot.models.Slot;
import parkinglotjava.parkinglot.models.SlotStatus;
import parkinglotjava.parkinglot.models.Ticket;
import parkinglotjava.parkinglot.models.Vehicle;
import parkinglotjava.parkinglot.models.VehicleType;
import parkinglotjava.parkinglot.repo.GateRepo;
import parkinglotjava.parkinglot.repo.ParkingLotRepo;
import parkinglotjava.parkinglot.repo.SlotRepo;
import parkinglotjava.parkinglot.repo.TicketRepo;
import parkinglotjava.parkinglot.repo.VehicleRepo;
import parkinglotjava.parkinglot.stratergy.SlotAssignmentStratergy;
import parkinglotjava.parkinglot.stratergy.getSlotFactory;

public class TokenService {

    private GateRepo gr;
    private VehicleRepo vehicleRepo;
    private SlotRepo slotRepo;
    private ParkingLotRepo parkingLotRepo;
    private TicketRepo ticketRepo;


    public TokenService(GateRepo gr, VehicleRepo vehicleRepo,SlotRepo slotRepo,ParkingLotRepo parkingLotRepo,TicketRepo ticketRepo) {
        this.gr = gr;
        this.vehicleRepo = vehicleRepo;
        this.slotRepo = slotRepo;
        this.parkingLotRepo = parkingLotRepo;
        this.ticketRepo = ticketRepo;
    }
    
    public Ticket IssueTicket(String vehicleNumber, String vehicleOwner,int gateId, VehicleType vehicleType){
        
        // create a ticket
        Ticket t = new Ticket();

        // store entry time and other info
        t.setEntryTime(new Date());

        Optional<Gate> gateOptional = gr.findGateById(gateId);

        if(gateOptional.isEmpty()){
            System.out.println("Gate is empty...");
            return null;
        }

        Gate g = gateOptional.get();

        t.setGenratedGate(g);

        Vehicle v;
        Optional<Vehicle> vehicleOptional = vehicleRepo.findVehicleByNumber(vehicleNumber);

        if (vehicleOptional.isEmpty()) {
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleName(vehicleNumber);
            newVehicle.setOwnerName(vehicleOwner);
            newVehicle.setVehicleType(vehicleType);
            
            v = vehicleRepo.saveVehicle(newVehicle);
        } else {
            v = vehicleOptional.get();
        }
        
        t.setVehicle(v);

        // find a slot and change the slot status

        SlotAssignmentStratergy stratergy = getSlotFactory.getSlotStratergy(g.getParkingLot().getSlotAssignmentStratergy());

        if(stratergy == null){
            throw new RuntimeException("Stratergy implementation missing not found");
        }

        Optional<Slot> slotOptional = stratergy.getSlot(vehicleType, g);

        if(slotOptional.isEmpty()){
            throw new RuntimeException("No empty slot available");
        }

        Slot s = slotOptional.get();


        t.setParkingSlots(s);
        // s.setParkingSlotStatus(SlotStatus.FILLED);

        slotRepo.updateSlot(s, SlotStatus.FILLED);

        parkingLotRepo.updateCountById(g.getParkingLot());

        //save ticket to db;
        Ticket finalTicketWithId = ticketRepo.saveTicket(t);

        System.out.println("Final Ticket issued with id: " + finalTicketWithId.getNumber());

        

        // store entry time and other info
        // return the token

        return null;
    }
}
