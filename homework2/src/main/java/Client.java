import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8888;
        try (Socket clentSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clentSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clentSocket.getInputStream()));
             Scanner sc = new Scanner(System.in)) {

            String message = in.readLine();
            System.out.println(message);
            String name = sc.nextLine();
            out.println(name);

            message = in.readLine();
            System.out.println(message);

            message = in.readLine();
            System.out.println(message);
            String answer = sc.nextLine();
            out.println(answer);

            message = in.readLine();
            System.out.println(message);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
