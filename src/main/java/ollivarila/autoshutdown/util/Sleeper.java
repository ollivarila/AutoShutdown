package ollivarila.autoshutdown.util;

import ollivarila.autoshutdown.MyLogger;

import java.util.logging.Level;

public abstract class Sleeper {
    protected void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            MyLogger.log(Level.INFO, "Sleep interrupted");
        }
    }

    protected void sleepSeconds(int seconds){
        int secondsInMs = seconds * 1000;
        try {
            Thread.sleep(secondsInMs);
        } catch (InterruptedException e) {
            MyLogger.log(Level.INFO, "Sleep interrupted");
        }
    }
}
