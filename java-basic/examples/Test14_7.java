package bitcamp.java100;

public class Test14_7 {

public static void main (String[] args) {

class bit{

String tit;
String name;
int eng;
int kor;
int sum;
float avg;
}

bit s1 = new bit();

s1.tit = "너는";
s1.name = "인성";
s1.eng = 30;
s1.kor = 50;
s1.sum = s1.eng + s1.kor;
s1.avg = s1.sum / 3.0f;

System.out.printf("%s %s %d %d %d %f\n", s1.tit, s1.name, s1.eng, s1.kor, 
s1.sum, s1.avg);
}
}
