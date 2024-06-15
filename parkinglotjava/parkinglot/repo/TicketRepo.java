package parkinglotjava.parkinglot.repo;

import java.util.HashMap;
import java.util.Map;

import parkinglotjava.parkinglot.models.Ticket;

public class TicketRepo {

    int PreviousId = -1;

    private Map<Integer, Ticket> ticketMap = new HashMap<>();

    public Ticket saveTicket(Ticket t){
        int newNumber = PreviousId + 1;
        t.setId(PreviousId + 1);
        t.setNumber(newNumber + "");

        ticketMap.put(newNumber, t);
        PreviousId+=1;
        return t;


    }
    
}
