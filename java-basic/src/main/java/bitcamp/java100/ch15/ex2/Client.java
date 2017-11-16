package bitcamp.java100.ch15.ex2;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner; 

public class Client {

    public static void main(String[] args) throws Exception {
        
        Socket socket = new Socket("localhost", 9999);
        System.out.println("서버와 연결되었다!");
        
        System.out.printf("%s:%d\n", 
                socket.getInetAddress().getHostAddress(),
                socket.getPort());
        
        socket.close();

    }
}
