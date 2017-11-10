package bitcamp.java100.test21.step10;


public class ContactArray {

    static Contact[] contacts = new Contact[100];

    static int i = 0;

    static void add(Contact contact) {
        if (i >= contacts.length)
            throw new RuntimeException("최대 저장 개수 초과");
        contacts[i] = contact;
        i++;

    }

    static Contact get(int index) {
        if (index < 0 || index >= i)
        throw new RuntimeException("유효하지 않은 인덱스");
            return contacts[index];
    }
    
    static int size() {
        return i;
    }

}
