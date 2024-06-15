package parkinglotjava.parkinglot.stratergy;

import parkinglotjava.parkinglot.models.SlotAssignmentStratergyEnum;

public class getSlotFactory {
    
    public static SlotAssignmentStratergy getSlotStratergy(SlotAssignmentStratergyEnum e){
        if(e.equals(SlotAssignmentStratergyEnum.RANDOM)){
            return new RandomSlotGenerator();
        }

        return null;
    }
}
