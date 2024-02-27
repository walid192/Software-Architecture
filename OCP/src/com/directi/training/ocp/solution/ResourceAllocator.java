package com.directi.training.ocp.solution;


public class ResourceAllocator {

    public int allocate(Resource resource) {
        int resourceId=resource.getSlotFindingStrategy().findFreeSlot();
        resource.markBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {
        resource.markFree(resourceId);
       
    }
}