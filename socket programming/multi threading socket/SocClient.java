import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class SocClient {
    public static void main(String[] args) throws IOException {
        String ip = "localhost";
        int port = 9999;


        Socket socket = new Socket(ip, port);
        // send data to server
        PrintWriter out = new PrintWriter( socket.getOutputStream(), true);

        // receive data from server
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line = null;

        while(!"exits".equalsIgnoreCase(line)){
            System.out.println("What you want[Date/Time]: ");
            line = sc.nextLine();
            out.println(line);
            out.flush();

            // you have received data
            System.out.println("received data from server: " + in.readLine());
        }
    }
}