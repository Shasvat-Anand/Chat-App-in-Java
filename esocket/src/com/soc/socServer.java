package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class socServer {
   public static void main(String[] args) throws Exception {
       System.out.println("server is running");
       ServerSocket ss=new ServerSocket(12345);

       System.out.println("server is waiting of client");
       Socket s=ss.accept();

       System.out.println("client is connected");

       BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
       String str=br.readLine();

       System.out.println("client Name is"+str);
   }
}
//
//package com.soc;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class socServer {
//    public static void main(String[] args) throws Exception {
//        System.out.println("Server is running");
//        ServerSocket ss = new ServerSocket(12345);
//
//        System.out.println("Server is waiting for client");
//        Socket s = ss.accept();
//
//        System.out.println("Client is connected");
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()))) {
//            String str = br.readLine();
//            System.out.println("Client Name is: " + str);
//        }
//
//        s.close();
//        ss.close();
//    }
//}
