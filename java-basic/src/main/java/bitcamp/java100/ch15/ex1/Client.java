package bitcamp.java100.ch15.ex1;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner; 

public class Client {

    public static void main(String[] args) throws Exception {
        
        Socket socket = new Socket("192.168.0.66", 9999);
        System.out.println("서버와 연결되었다!");
        
        System.out.printf("클라이언트IP = %s\n", 
                socket.getLocalAddress().getHostAddress());
        
        System.out.printf("클라이언트Port = %d\n", 
                socket.getLocalPort());
        
        System.out.printf("서버IP = %s\n", 
                socket.getInetAddress().getHostAddress());
        
        System.out.printf("서버 Port= %d\n", 
                socket.getPort());
        
        socket.close();

    }
}
