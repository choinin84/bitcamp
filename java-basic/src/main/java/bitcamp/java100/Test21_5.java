package bitcamp.java100;

import java.io.Console;

public class Test21_5 {

    public static void main(String[] args) {

        class Calculation {
            int x;

        }

        Console console = System.console();

        Calculation c = new Calculation();

        c.x = Integer.parseInt(console.readLine("구구단? "));

        if (1 < c.x && c.x < 10) {

            System.out.printf("[%d]\n", c.x);
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d\n", c.x, j, c.x * j);

            }
            System.out.printf("----------------");


        }

        else if (c.x < 0)
            System.out.println("다음에 또 봐요!");
        else
            System.out.println("2단에서 9단까지 가능합니다.");

    }
}
