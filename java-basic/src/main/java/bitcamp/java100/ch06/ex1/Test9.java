package bitcamp.java100.ch06.ex1;

public class Test9 {

    public static void main(String[] args) {
        Score9 score;
        score = new Score9("홍길동");
        
        System.out.printf("이름=%s\n", score.name);
        System.out.printf("총점=%d\n", score.sum);
        System.out.printf("평균=%.2f\n", score.aver);
        
        //score = new Score3; 컴파일 오류!
        
        //score = new Score3("홍길동"); Score3에는 문자열을 받는 생성자가 없다.(컴파일 오류!)
        
    
    }
}
