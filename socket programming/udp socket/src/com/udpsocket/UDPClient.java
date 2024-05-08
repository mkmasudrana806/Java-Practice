package com.udpsocket;

import java.io.IOException;
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        // in TCP first build connection. so data need not to know where it go.
        // in UDP there is not connection. so packet should know where it will go
        DatagramSocket ds = new DatagramSocket();

        int i = 8;
        // DatagramPacket it receive 4 parameter
//      DatagramPacket dp = new DatagramPacket(data, data.length, ip, port);
        // data must be in byte array format
        byte[] b = String.valueOf(i).getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        // send data. make packet, then send this packet with help of the DatagramPacket
        /**
         * @params
         * buf – the packet data, in buffer format
         * length – the packet length, mainly buffer length
         * address – the destination address, or null. mainly ip address
         * port – the destination port number.
         */
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 9999);
        ds.send(dp);

        // response from server
        byte[] b1 = new byte[1024];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);

        String str = new String(dp1.getData()).trim();
        System.out.println("result is: " + str);


    }
}
