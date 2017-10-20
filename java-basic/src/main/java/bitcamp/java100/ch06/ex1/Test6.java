package bitcamp.java100.ch06.ex1;

public class Test6 {

    public static void main(String[] args) {
        Score5 score;
        score = new Score5("임꺽정", 100, 100, 100); 
        
        score = new Score5("유관순");
        
        
        System.out.printf("이름=%s\n", score.name);
        System.out.printf("총점=%s\n", score.sum);
        System.out.printf("평균=%s\n", score.aver);
        
        //score = new Score3; 컴파일 오류!
        
        //score = new Score3("홍길동"); Score3에는 문자열을 받는 생성자가 없다.(컴파일 오류!)
        
        
        
        
        
        
        
    
    }
}
