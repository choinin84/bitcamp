package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.sql.Date;

public class Test5 {
    
    public static void main(String[] args) {
        
        File file = new File(".");
        
        String[] filenames = file.list(new MyFilenameFilter());
        
        for(String name : filenames) {
            System.out.printf(name);
         }
    }
}
