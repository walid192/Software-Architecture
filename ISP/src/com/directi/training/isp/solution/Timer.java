package com.directi.training.isp.solution;
import java.util.TimerTask;

public class Timer {
    public void register(long timeOut, Timed door) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}
