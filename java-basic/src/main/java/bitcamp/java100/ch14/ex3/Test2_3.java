package bitcamp.java100.ch14.ex3;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2_3 {
    public static void main(String[] args) throws Exception {

        Score s = new Score("홍길동", 800, 900, 1000);
        
        DataInputStream in = new DataInputStream(new FileInputStream("test3.dat"));

        s.setName(in.readUTF());
        s.setKor(in.readInt()); 
        s.setEng(in.readInt()); 
        s.setMath(in.readInt()); 

        in.close();

        System.out.println(s);

    }
}
