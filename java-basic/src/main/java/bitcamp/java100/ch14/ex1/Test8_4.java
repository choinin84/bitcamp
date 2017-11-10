package bitcamp.java100.ch14.ex1;

import java.util.Scanner;

public class Test8_4 {
 static Scanner keyScan = new Scanner(System.in);
    static int f(int n) {
    
       
       if(n % 100 == 0) {
           keyScan.nextLine();
       }
        
        if(n == 0)
            return 0;
        return n + f(n-1);
        
        }
      
    public static void main(String[] args) throws Exception {
        int sum = f(9999);
        System.out.println(sum);
      
      }
        
        }

    


