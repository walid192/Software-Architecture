package com.directi.training.ocp.solution;

public class SpaceSlotResource implements Resource {

    private final SlotFindingStrategy slotFindingStrategy;

    public SpaceSlotResource() {
        this.slotFindingStrategy = new SpaceSlotFindingStrategy();
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
