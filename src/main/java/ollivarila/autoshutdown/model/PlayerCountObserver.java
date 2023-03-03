package ollivarila.autoshutdown.model;

import ollivarila.autoshutdown.MyLogger;
import ollivarila.autoshutdown.util.Sleeper;
import org.bukkit.Server;

import java.util.logging.Level;

public class PlayerCountObserver extends Sleeper implements Runnable{

    private final Server server;
    private boolean isRunning = false;

    private ShutdownSequence sequence;

    public PlayerCountObserver(Server server){
        this.server = server;
    }

    @Override
    public void run(){
        isRunning = true;
        monitorServer();
    }

    private void monitorServer(){
        while(isRunning){
            if(serverEmpty()){
                tryCreateAndStartSequence();
            }
            sleepSeconds(30);
        }
    }

    private boolean serverEmpty(){
        return server.getOnlinePlayers().size() == 0;
    }


    private void tryCreateAndStartSequence(){
        if(canResetSequence()) {
            sequence = new ShutdownSequence(server);
            MyLogger.log(Level.INFO, "0 players detected, starting shutdown sequence...");
            sequence.runSequence();
        }
    }

    private boolean canResetSequence(){
        if(this.sequence == null){
            return true;
        }
        return !this.sequence.isRunning();
    }

    public void stopThread(){
        this.isRunning = false;
    }
}
