package com.directi.training.isp.solution;
import java.util.Random;

public class Sensor {
    public void register(ProximitySensitive door) {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }

}
