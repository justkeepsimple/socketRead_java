package m.icoolh;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client extends Thread{


    private ObjectInputStream istream;

    public Client(int port) throws IOException {
        Socket socket = new Socket("localhost", port);
        istream = new ObjectInputStream(socket.getInputStream());
    }


    public void readMsg() throws IOException, ClassNotFoundException {
        while (true){
            Message msg = (Message) istream.readObject();
            System.out.println(msg);
            System.out.println("***************");
        }
    }


    @Override
    public void run() {
        try {
            readMsg();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
