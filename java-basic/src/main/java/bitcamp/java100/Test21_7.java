package bitcamp.java100;

import java.io.Console;

public class Test21_7 {

    public static void main(String[] args) {
    
     Console console = System.console();
        
     
     if (console == null) {
         System.err.println("콘솔을 지원하지 않습니다.");
         System.exit(1); // JVM을 종료한다.
     }  
    

    String sen = console.readLine("문자열:");
     
      for(int i = sen.length()-1; i >= 0; i--) {
        System.out.print(sen.charAt(i));
    }
    
   
  
        
           
       

}

}
