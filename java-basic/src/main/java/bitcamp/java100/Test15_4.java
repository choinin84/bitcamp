package bitcamp.java100;

public class Test15_4 {

public static void main (String[] args) {

float f1 = 3.141592f;
int i1 = 7654321;

System.out.printf("f1=%f, i1=%d\n", f1, i1);

double r1 = f1 + i1; //float와 int는 서로 타입이 다르기 때문에 연산 불가!

System.out.println(r1);

r1 = (double) f1 + (double) i1; 
System.out.println(r1);














}
}
