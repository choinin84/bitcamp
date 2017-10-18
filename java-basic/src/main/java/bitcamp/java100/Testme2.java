package bitcamp.java100;



public class Testme2 {

    public static void main(String[] args) {

        int i = 1;
        while (i <= 5) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i += 2;
            
        }
        if(i == 7) {
            i = 3;
        while (i > 0) {
            int count = (5 - i) / 2;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i -= 2;
        }
        }
    } 
}
