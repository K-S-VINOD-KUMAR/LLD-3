package parkinglotjava.parkinglot.repo;

import java.util.HashMap;
import java.util.Map;

import parkinglotjava.parkinglot.models.ParkingLot;

public class ParkingLotRepo {

    Map<Integer, ParkingLot> capacityMap = new HashMap<>();

    public ParkingLot updateCountById(ParkingLot p){
        p.setCapacity(p.getCapacity() - 1);

        return p;
    }
    
}
