package ollivarila.autoshutdown.controller;

import ollivarila.autoshutdown.model.PlayerCountObserver;
import org.bukkit.Server;

public class ShutdownController {
    private final Thread observerThread;
    private final PlayerCountObserver playerCountObserver;
    public static ShutdownController started(Server server){
        ShutdownController controller = new ShutdownController(server);
        controller.startMonitoring();
        return controller;
    }
    private ShutdownController(Server server){
        this.playerCountObserver = new PlayerCountObserver(server);
        this.observerThread = new Thread(playerCountObserver);
    }
    public void startMonitoring(){
        this.observerThread.start();
    }
    public void stopMonitoring(){
        playerCountObserver.stopThread();
    }
}
