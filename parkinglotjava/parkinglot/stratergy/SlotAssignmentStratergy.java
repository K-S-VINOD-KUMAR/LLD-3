package parkinglotjava.parkinglot.stratergy;

import java.util.Optional;

import parkinglotjava.parkinglot.models.Gate;
import parkinglotjava.parkinglot.models.Slot;
import parkinglotjava.parkinglot.models.VehicleType;


public interface SlotAssignmentStratergy {
    public Optional<Slot> getSlot(VehicleType vehicleType, Gate g);
}
