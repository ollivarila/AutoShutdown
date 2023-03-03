package ollivarila.autoshutdown.controller;

import mocks.MockPlayer;
import mocks.MockServer;
import org.bukkit.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ShutdownControllerTest {

    private boolean hasBeenCalled = false;

    @BeforeEach
    public void beforeEach(){
        hasBeenCalled = false;
    }

    @Test
    public void startMonitoring_test(){
        MockServer server = new MockServer(hasBeenCalled);

        ShutdownController controller = new ShutdownController(server);

        Collection<Player> players = new ArrayList<>();

        players.add(new MockPlayer());
        players.add(new MockPlayer());

        server.setPlayers(players);

        controller.startMonitoring();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        assertTrue(hasBeenCalled);
    }



}