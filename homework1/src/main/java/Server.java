import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket clientSocket = serverSocket.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            System.out.println("New connection accepted");
            final String clientStr = in.readLine();
            final int clientPort = clientSocket.getPort();
            System.out.printf("Hi %s, your port is %d", clientStr, clientPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
