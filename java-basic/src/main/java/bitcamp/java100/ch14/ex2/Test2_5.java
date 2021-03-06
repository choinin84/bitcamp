package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;

public class Test2_5 {

    public static void main(String[] args) throws Exception {
        
      MyBufferedOutputStream out = new MyBufferedOutputStream("./test2.dat");
      
      long start = System.currentTimeMillis();         
      
        int[] data = new int[4000000];

        for(int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100000);
        }

        for(int b : data) {
            out.write(b);
        }
        out.flush();
        
        long end = System.currentTimeMillis();
        System.out.printf("걸린시간 = %d\n", (end - start));
        out.close();
    }
}

