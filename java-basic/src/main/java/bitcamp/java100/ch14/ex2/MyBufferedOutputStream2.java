package bitcamp.java100.ch14.ex2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedOutputStream2 {

    OutputStream worker;
    
    byte[] buf = new byte[8192];
    int len;
    int cursor;

    public  MyBufferedOutputStream2(OutputStream worker) {
        this.w;
    }

    @Override
    public void write(int b) throws IOException {
        if(cursor == buf.length);{ 
            this.write(buf);
            cursor = 0;
        }

        buf[cursor++] = (byte)b;
    }
    public static void main(String[] args) {
        int data = 0x000000fa; //250

        byte b = (byte)data;
        System.out.println(Integer.toHexString(b));
    }
    
    @Override
    public void flush() throws IOException {
        this.write(buf, 0, cursor);
    }
}




