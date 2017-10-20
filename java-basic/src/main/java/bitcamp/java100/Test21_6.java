package bitcamp.java100;

import java.io.Console;

public class Test21_6 {

    public static void main(String[] args) {

        class Number {
            int s = 0;
            int[] arr = new int[10];

        }

        Console console = System.console();

        Number n = new Number();

        n.s = Integer.parseInt(console.readLine("숫자? "));

        for (int i = 0; n.s > 0; n.s /= 10) {
            n.arr[n.s % 10]++;

        }

        for (int j = 0; j < 10; j++) {
            System.out.printf("%d : %d개\n", j, n.arr[j]);

        }

    }
}
