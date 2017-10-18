package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8 {

    static class Custif {
        String names;
        String email;
        String phone;
    }

    public static void main(String[] args) {

        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }

        Custif i = new Custif();

        ArrayList names = new ArrayList();
        ArrayList email = new ArrayList();
        ArrayList phone = new ArrayList();

        while (true) {
            i.names = console.readLine("이름?");
            i.email = console.readLine("메일?");
            i.phone = console.readLine("전화?");

            if (console.readLine("저장하시겠습니까?(y/n)").equals("y") == true) {
                names.add(i.names);
                email.add(i.email);
                phone.add(i.phone);
                System.out.println("저장하였습니다");
            }
            else System.out.println("저장을 취소하셨습니다.");

                if(console.readLine("계속하시겠습니까?(y/n)").equals("y") == true) 
                    continue;
                    else  break;
                
            }
       
                    System.out.println();
                    for(int x = 0; x < names.size(); x++) {
                        System.out.printf("%s\t", names.get(x));
                        System.out.printf("%s",   email.get(x));
                        System.out.printf("%s\n", phone.get(x));
                        
                        
                
            }
        }

}
    

