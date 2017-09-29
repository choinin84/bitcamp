package bitcamp.java100;

public class Test12_9 {

public static void main (String[] args) {

char c1;

c1 = 44032;

char c2 = 0xAC00;

System.out.println(c1);
System.out.println(c2);

char n1 = 0xC870, n2 = 0XC778, n3 = 0XC131;

System.out.printf("%C %C %C\n", n1, n2, n3);

n1 = '조'; 
n2 = '인';
n3 = '성';
System.out.printf("%C %C %C", n1, n2, n3);

char x = '7';
int num;
num = x - 48;
System.out.println(num);




    }
}