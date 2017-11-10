package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.util.ArrayList;

public class Test8 {
    
    public static void main(String[] args) throws Exception {
        
            
            File file = new File(".");

            printFiles(file);
        }
        
    
    static void printFiles(File dir) throws Exception {
        File[] files = dir.listFiles();
        
        String path;
        int i = 0;
        for(File f : files) {
         if(f.isFile() && f.getName().endsWith(".class")) {
             path = f.getCanonicalPath();
             i = path.indexOf("bin") + 4;
             
             System.out.println(
                      path.substring(i)
                     .replace(".class", "")
                     .replace("/",".")
                     .replaceAll("\\", "."));
         }
         
         if(f.isDirectory()) {
             printFiles(f);
     }
}
}
}

