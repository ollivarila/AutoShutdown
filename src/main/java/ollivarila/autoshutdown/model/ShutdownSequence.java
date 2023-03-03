package ollivarila.autoshutdown.model;

import ollivarila.autoshutdown.MyLogger;
import ollivarila.autoshutdown.Requester;
import ollivarila.autoshutdown.util.Sleeper;
import org.bukkit.Server;

import java.util.logging.Level;


public class ShutdownSequence extends Sleeper {
    private final Server server;
    private int seconds;
    private boolean isRunning = true;
    private final int FIVE_MIN = 300;

    private final Requester requester = new Requester();

    public ShutdownSequence(Server server) {
        this.server = server;
    }

    public void runSequence() {
        while(isRunning){
            tick();
            sleepOneSecond();
        }
    }

    private boolean serverNotEmpty(){
        return server.getOnlinePlayers().size() > 0;
    }

    private void stopSequence(){
        MyLogger.log(Level.INFO, "Stopping shutdown sequence");
        isRunning = false;
    }

    private void tick(){
        seconds++;

        if(serverNotEmpty()){
            stopSequence();
            return;
        }

        if(seconds == FIVE_MIN) {
            stopServer();
            isRunning = false;
            return;
        }
        doLogging();
    }

    private void doLogging(){
        int remaining = FIVE_MIN - seconds;
        boolean isExactlyMinute = remaining % 60 == 0; // Log if time remaining is 5 min or 4 min etc.
        if(isExactlyMinute) {
            int minutes = remaining / 60;
            MyLogger.log(Level.INFO, minutes + " minute(s) until shutdown");
        }
    }
    private void stopServer(){
        this.requester.stopContainer();
        this.server.shutdown();
    }

    public boolean isRunning(){
        return isRunning;
    }
}
