package parkinglotjava.parkinglot.stratergy;

import parkinglotjava.parkinglot.models.Slot;
import parkinglotjava.parkinglot.models.VehicleType;

import java.util.Optional;

import parkinglotjava.parkinglot.models.Gate;


public class RandomSlotGenerator implements SlotAssignmentStratergy{
    
        @Override
        public Optional<Slot> getSlot(VehicleType vehicleType, Gate g){
            // find parkingLot from gate
            // find a floor with allowed vehicle type
            // return the slot with same type where status is empty

            return Optional.empty();
        }
    
}
