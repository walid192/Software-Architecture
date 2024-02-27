package com.directi.training.ocp.solution;

public class TimeSlotResource implements Resource{

    private final SlotFindingStrategy slotFindingStrategy;

    public TimeSlotResource() {
        this.slotFindingStrategy = new TimeSlotFindingStrategy();
    }


    @Override
    public void markFree(int resourceId) {
    }

    @Override
    public void markBusy(int resourceId) {
    }


    @Override
    public SlotFindingStrategy getSlotFindingStrategy() {
       return slotFindingStrategy;
    }

    
}
