package bitcamp.java100.ch14.ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test1_0 {
    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800, 900, 1000);
        
        FileOutputStream out = new FileOutputStream("test1.dat");
        
        byte[] bytes = s.getName().getBytes("UTF-8");
        
        out.write(bytes.length);
        
        out.write(bytes);
        
        out.write(s.getKor()); //0x00 00 03 20
        out.write(s.getEng()); //0x00 00 03 84
        out.write(s.getMath());//0x00 00 03 E8
        out.write(s.getSum()); //0x00 00 00 0A 8C 
        //out.write(s.getAver());
        
        out.close();
        
        System.out.println("출력을 완료했습니다");
        
        
    }
}
