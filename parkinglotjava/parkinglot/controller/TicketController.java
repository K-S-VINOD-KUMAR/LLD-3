package parkinglotjava.parkinglot.controller;

import parkinglotjava.parkinglot.DTO.IssueTicketRequest;
import parkinglotjava.parkinglot.DTO.IssueTicketResponse;
import parkinglotjava.parkinglot.Services.TokenService;
import parkinglotjava.parkinglot.models.Ticket;

public class TicketController {

    private TokenService tokenService;

    public TicketController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    public IssueTicketResponse IssueTicket(IssueTicketRequest request){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket t = tokenService.IssueTicket(request.getVehicleNo(), request.getOwnerName(), request.getGateId(), request.getVehicleType());
            response.setSlot(t.getParkingSlots());
            response.setEntryTime(t.getEntryTime());
            response.setTicketNumber(t.getNumber());
            response.setVehicle(t.getVehicle());
            response.setStatusCode("SUCCESS");

        }
        catch(Exception e){
            response.setStatusCode("FAILURE");
            response.setFailureString(e.toString());
        }

        return response;

    }
    
}

// 1. need to interact with client
// 2. client send request -> validate that
// 3. call services for business logic
// 4. response from services send back to client
