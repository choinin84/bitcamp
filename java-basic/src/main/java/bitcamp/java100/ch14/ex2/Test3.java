package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
    
    public static void main(String[] args) throws Exception {
        
        File file = new File("sample/B.jpg");
        
        FileInputStream in = new FileInputStream(file);
        
        FileOutputStream out = new FileOutputStream(
                new File("sample/B2.jpg"));
        
        int b;
        while((b = in.read()) != -1){
            out.write(b);
        }
       in.close();
       out.close();
       
       System.out.println("파일 복사 완료했음!");
    }
}

