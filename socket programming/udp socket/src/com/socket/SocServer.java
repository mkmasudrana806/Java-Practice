package com.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Server is started");
        // big socket, it handle all user request
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("Server is waiting for client");
        // if any request server accept, then Socket create a socket client
        Socket s = ss.accept();

        System.out.println("Client is connected");

        // read buffer from socket
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = br.readLine();

        System.out.println("Client Date: " + data);


        PrintWriter pf = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        pf.println("Rana");
        pf.close();


    }
}
