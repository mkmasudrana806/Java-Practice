import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        
        // multi threading communication
        while (true) {

            Socket client = ss.accept();
            System.out.println("Client connected at: " + client.getInetAddress().getHostAddress());

            // client handler create
            ClientHandler clientHandler = new ClientHandler(client);

            // run a thread for this client
            new Thread(clientHandler).start();

            //
        }
     /* two way
        while (true) {

            Socket client = ss.accept();
            // read data from client
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            // you have received data
            System.out.println("received data from client: " + in.readLine());

            // send data to client
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);


            System.out.println("Enter data to send to client: ");
            line = sc.nextLine();
            out.println(line);
            out.flush();
        }
      */
    }
}


// client handler class
// ClientHandler class
class ClientHandler implements Runnable {
    private final Socket clientSocket;
    ClientHandler(Socket client) {
        this.clientSocket = client;
    }
    @Override
    public void run()
    {
        PrintWriter out = null;
        BufferedReader in = null;
        try {

            // get the outputstream of client
            out = new PrintWriter(
                    clientSocket.getOutputStream(), true);

            // get the inputstream of client
            in = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()));

            String line;
            while ((line = in.readLine()) != null) {

                // writing the received message from
                // client
                System.out.printf(
                        " Sent from the client: %s\n",
                        line);
                out.println(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                    clientSocket.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}