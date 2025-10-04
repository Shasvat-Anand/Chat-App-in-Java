package com.soc;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class socclient {
    public static void main(String[] args) throws Exception{
        String ip="localhost";
        int port=12345;
        Socket sc=new Socket(ip,port);

        String str="Anand Agrahari";

        OutputStreamWriter os= new OutputStreamWriter(sc.getOutputStream());
        PrintWriter out=new PrintWriter(os);
        os.write(str);
        os.flush();
    }

}
//package com.soc;
//
//import java.io.OutputStreamWriter;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class socclient {
//    public static void main(String[] args) throws Exception {
//        String ip = "localhost";
//        int port = 12345;
//        Socket sc = new Socket(ip, port);
//
//        String str = "Anand Agrahari";
//
//        // Send data to the server
//        OutputStreamWriter os = new OutputStreamWriter(sc.getOutputStream());
//        PrintWriter out = new PrintWriter(os);
//        out.println(str); // Use println() to send a properly terminated line
//        out.flush();
//
//        // Close resources
//        out.close();
//        sc.close();
//    }
//}
