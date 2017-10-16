package bitcamp.java100;

public class Test14_me {

public static void main (String[] args) {
 
    String[] names = {"홍길동", "임꺽정", "유관순"};
    int[][] scores = {{100, 100, 100}, {90, 90, 80}, {100, 80, 90}};
    int[] total = {100, 200, 300};
    float[] aver = {100f, 90f, 80f};

    for(int i = 0; i < names.length; i++) { 
        System.out.printf("%s %d %d %d %d %.1f\n", names[i], scores[i][0], 
        scores[i][1], scores[i][2], total[i], aver[i]);
    }
}
}