package ollivarila.autoshutdown;

import ollivarila.autoshutdown.util.Sleeper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Level;

public class Requester extends Sleeper {

    private final HttpClient client;
    private boolean success = false;

    public Requester(){
        this.client = HttpClient.newHttpClient();
    }

    public void stopContainer() {
        while(!success){
            tryStopping();
            sleepOneSecond();
        }
    }

    public void tryStopping(){
        try {
            sendStopRequest();
        } catch (InterruptedException | IOException e) {
            MyLogger.log(Level.SEVERE, "Error occurred while sending container stop request");
        }
    }



    private void sendStopRequest() throws IOException, InterruptedException {
        String token = System.getenv("MY_TOKEN");
        String url = "https://minebot-skd.fly.dev/api/server/shutdown";
        HttpRequest request = HttpRequest
                .newBuilder(URI.create(url))
                .POST(HttpRequest.BodyPublishers.noBody())
                .header("Authorization", "Bearer " + token)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        MyLogger.log(Level.INFO,"Response:");
        MyLogger.log(Level.INFO, response.toString());
        MyLogger.log(Level.INFO,response.body());
        if(response.statusCode() == 204){
            success = true;
        }
    }
}
