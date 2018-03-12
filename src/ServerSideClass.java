import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSideClass {
    BufferedReader bufferedReader;

    public void go() {
        try{
            ServerSocket serverSocket = new ServerSocket(4242);
            Socket socket = serverSocket.accept();

                InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
                bufferedReader = new BufferedReader(streamReader);
        } catch(IOException e) {
          e.printStackTrace();
        }
    }
}
