package m.icoolh;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        int port = 12452;
        ServerSocket localhost = new ServerSocket(12452);
        Server server = new Server(localhost);
        server.start();

        Client client = new Client(port);
        client.start();


        Thread.sleep(1000 * 1000);
    }
}
