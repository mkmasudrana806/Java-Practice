package com.udpsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(9999);

        byte[] b1 = new byte[1024];
        /**
         * @params
         *
         * buf: buffer for holding the incoming datagram
         * len: the number of bytes to read
         *
         */
        DatagramPacket dp = new DatagramPacket(b1, b1.length); //
        ds.receive(dp);

        /**
         * @params
         *
         * bytes – The bytes to be decoded into characters
         *
         */
        String receiveData = new String(dp.getData()).trim(); // params: The bytes to be decoded into characters


        // send data to the client
        int num = Integer.parseInt(receiveData);
        int mul = num * num;
        byte[] b2 = String.valueOf(mul).getBytes();
        InetAddress ia = InetAddress.getLocalHost();

        DatagramPacket dp1 = new DatagramPacket(b2, b2.length, ia, dp.getPort());
        ds.send(dp1);

    }
}
