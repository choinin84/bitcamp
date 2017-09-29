package bitcamp.java100;

public class Test13_1 {

public static void main (String[] args) {

int kor, eng, math, soc, sci, eth, chi;

kor = 100;
eng = 100;
math = 100;
soc = 100;
sci = 100;
eth = 100;
chi = 100;


String[] subject = new String[7];
subject [0] = "kor";
subject [1] = "eng";
subject [2] = "math";
subject [3] = "soc";
subject [4] = "sci";
subject [5] = "eth";    
subject [6] = "chi";

int[] scores = new int[7];
scores[0] = 100;
scores[1] = 100;
scores[2] = 100;
scores[3] = 100;
scores[4] = 100;
scores[5] = 100;    
scores[6] = 100;

for (int i = 0; i < 7; i++) {
    System.out.printf("%s %d\n", subject[i], scores[i]);
  }



}
}