package bitcamp.java100.test21.step10;

import java.io.Console;

public class Test {

    static Console console;

    static void printContacts() {

        for (int j = 0; j < ContactArray.size(); j++) {
            Contact contact = ContactArray.get(j);
            System.out.printf("%s, %s, %s\n", contact.name, contact.email, contact.tel);
        }

    }

    static boolean confirm(String message) {

        String input = console.readLine(message + "(y/n) ");
        if (input.toLowerCase().equals("y") || input.toLowerCase().equals("yes"))

            return true;
        return false;

    }

    static Contact inputContact() {

        Contact contact = new Contact();
        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");
        return contact;

    }


    public static void main(String[] args) {
       
        console = System.console();

        while (true) {

            Contact contact = inputContact();

            if (confirm("저장하시겠습니까?"));
             try{    
                 ContactArray.add(contact);
             } catch (RuntimeException e) {
                 System.err.println("최대 저장 개수를 초과하였습니다!");
                 break;
             }

            if (!confirm("계속 입력하시겠습니까?"))
                break;
        }

        printContacts();

    }
}