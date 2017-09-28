package bitcamp.java100;

public class Test14_2 {

public static void main (String[] args) {

class Sb {

String title;
String auth;
String pub;
int pages;
double cost;
}

Sb r1;

r1 = new Sb();

r1.title = "발리에서";
r1.auth = "조인성";
r1.pub= "거성";
r1.pages = 100;
r1.cost = 14.50;


System.out.printf("책제목:%s 저자:%s 출판사:%s %d쪽 $%.2f\n",
r1.title, r1.auth, r1.pub, r1.pages, r1.cost);















}
}