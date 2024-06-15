package parkinglotjava.parkinglot;

import parkinglotjava.parkinglot.DTO.IssueTicketRequest;
import parkinglotjava.parkinglot.DTO.IssueTicketResponse;
import parkinglotjava.parkinglot.Services.TokenService;
import parkinglotjava.parkinglot.controller.TicketController;
import parkinglotjava.parkinglot.models.VehicleType;
import parkinglotjava.parkinglot.repo.GateRepo;
import parkinglotjava.parkinglot.repo.ParkingLotRepo;
import parkinglotjava.parkinglot.repo.SlotRepo;
import parkinglotjava.parkinglot.repo.TicketRepo;
import parkinglotjava.parkinglot.repo.VehicleRepo;

public class Main {

    public static void main(String[] args) {
        
        GateRepo gr = new GateRepo();
        // TODO: populate the data

        VehicleRepo vr = new VehicleRepo();
        // TODO: populate the data

        SlotRepo sr = new SlotRepo();
        // TODO: populate the data

        ParkingLotRepo parkingLotRepo = new ParkingLotRepo();
        // TODO: populate the data

        TicketRepo ticketRepo = new TicketRepo();
        
        TokenService tokenService = new TokenService(gr, vr, sr, parkingLotRepo, ticketRepo);

        TicketController ticketController = new TicketController(tokenService);

        // REQUEST DTO
        
        IssueTicketRequest request = new IssueTicketRequest();
        request.setGateId(1);
        request.setOwnerName("Vinod kumar");
        request.setVehicleNo("AP01VK1234");
        request.setVehicleType(VehicleType.CAR);

        // RESPONSE DTO

        IssueTicketResponse response = ticketController.IssueTicket(request);



    }
    
}
