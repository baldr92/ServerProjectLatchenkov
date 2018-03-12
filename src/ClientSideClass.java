import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSideClass {
    public void setupNetworking() {
        try{
            Socket socket = new Socket("127.0.0.1", 4242);
            System.out.println("Connection complete");
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            System.out.println("");
            writer.println("Message");
            writer.println();
        } catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
