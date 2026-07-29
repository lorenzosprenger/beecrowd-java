package bee1041;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0) {
            if (y == 0) {
                System.out.println("Origem");
            }
            if (y != 0) {
                System.out.println("Eixo Y");
            }
        }

        if (y == 0) {
            if (x != 0) {
                System.out.println("Eixo X");
            }
        }

        if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
            }
            if (y < 0) {
                System.out.println("Q4");
            }
        }

        if (x < 0) {
            if (y > 0) {
                System.out.println("Q2");
            }
            if (y < 0) {
                System.out.println("Q3");
            }
        }





        sc.close();
    }
}