package bitcamp.java100.ch06.ex1;

public class Test2 {

    public static void main(String[] args) {
        Score2 score;
        score = new Score2();

        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;

      
    score.name = "홍길동";
    score.kor = 100;
    score.eng =100;
    score.math =100;
    score.sum = kor + eng + math;
    score.aver = sum / 3f;
    
    }
}
