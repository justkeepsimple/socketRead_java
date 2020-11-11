package m.icoolh;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    private ObjectOutputStream ostream;

    private ServerSocket serverSocket;

    private final Message msg = new Message("1", null);
    private final Message msg2 = new Message("21", null);

    public Server(ServerSocket serverSocket) throws IOException {
        this.serverSocket = serverSocket;
    }


    public void sendMsg() throws IOException {
        Socket accept = serverSocket.accept();
        System.out.println("accept");
        ostream = new ObjectOutputStream(accept.getOutputStream());
        while (true) {
            ostream.writeObject(msg);
        }
    }

    @Override
    public void run() {
        try {
            sendMsg();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
