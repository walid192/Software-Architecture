package com.directi.training.ocp.solution;

public interface Resource {
    void markFree(int resourceId);
    void markBusy(int resourceId);
    SlotFindingStrategy getSlotFindingStrategy();

}
