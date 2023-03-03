package ollivarila.autoshutdown;

import ollivarila.autoshutdown.controller.ShutdownController;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * Plugin for automatically shutting down a server when no players are present for 5 minutes
 *
 * @author  Olli Varila
 * 3.3.2023
 */

public final class Autoshutdown extends JavaPlugin {

    private ShutdownController controller;

    @Override
    public void onEnable() {
        initController();
        initLogger();
        MyLogger.log(Level.INFO, "Shutdown controller started");
    }

    private void initController(){
        controller = ShutdownController.started(getServer());
    }

    private void initLogger() {
        MyLogger.setLogger(getLogger());
    }

    @Override
    public void onDisable() {
        controller.stopMonitoring();
    }
}
