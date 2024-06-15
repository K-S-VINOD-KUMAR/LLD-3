package parkinglotjava.parkinglot.repo;

import java.util.HashMap;
import java.util.Map;

import parkinglotjava.parkinglot.models.Slot;
import parkinglotjava.parkinglot.models.SlotStatus;

public class SlotRepo {

    Map<Integer, Slot> slotMap = new HashMap<>();
    
    public Slot updateSlot(Slot s, SlotStatus status){
        return s;
    }
}
