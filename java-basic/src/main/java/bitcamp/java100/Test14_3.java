package bitcamp.java100;

public class Test14_3 {

public static void main (String[] args) {

class Stu {

String name;
String Ename;
String addr;
String Euback;
String birth;
String mobile;

}

Stu s1; 

s1 = new Stu();

s1.name = "조인성";
s1.Ename = "CHO IN SUNG";
s1.addr= "역삼동";
s1.Euback ="대졸";
s1.birth= "84년 10월 04일";
s1.mobile= "010-2961-8477";

System.out.printf("이름:%s |영어이름:%s |주소:%s |학력:%s |생일:%s |전화번호:%s\n", 
s1.name, s1.Ename, s1.addr, s1.Euback, s1.birth, s1.mobile);















}
}