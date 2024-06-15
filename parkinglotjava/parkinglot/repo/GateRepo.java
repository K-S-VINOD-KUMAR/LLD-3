package parkinglotjava.parkinglot.repo;

import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

import parkinglotjava.parkinglot.models.Gate;


public class GateRepo {

    private Map<Integer, Gate> gateMap = new HashMap<>();

    public Optional<Gate> findGateById(int gateId) {
        if(gateMap.containsKey(gateId)) {
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
    
}
