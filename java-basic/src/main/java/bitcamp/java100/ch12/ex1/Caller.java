package bitcamp.java100.ch12.ex1;

public class Caller {

    public static void main(String[] args) {

        Protocol obj = new Callee();

        //Protocol obj2 = new String(); 해당 인터페이스 규칙에 따라 만들지 않아서 레퍼런스 저장불가
        
        obj.m1();
        obj.m2();
        

    }
}
