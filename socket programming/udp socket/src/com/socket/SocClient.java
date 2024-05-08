package com.socket;


import java.io.*;
import java.net.Socket;

public class SocClient  {
    public static void main(String[] args) throws IOException {
        // ip and port
        String ip = "localhost";
        int port = 9999;


            Socket socket = new Socket(ip, port);

        String data = "Hello Masud Rana";

         // OutputStreamWriter: constructor takes where to write data like printer, socket, display etc.
        // it mainly makes data to stream. to write

        // send data
        PrintWriter pf = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
       pf.println(data);


       // receive buffer data from server
//        BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//        String receive = bf.readLine();
//        System.out.println("Server pass: "+ receive);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String datas = br.readLine();
        System.out.println("from server:" + datas);

    }
}
