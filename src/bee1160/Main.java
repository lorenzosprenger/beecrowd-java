package bee1160;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            double a1 = sc.nextDouble() / 100.0;
            double b1 = sc.nextDouble() / 100.0;

            int ano = 0;

            while (a <= b) {
                a += (int) (a * a1);
                b += (int) (b * b1);
                ano++;

                if (ano > 100) {
                    break;
                }
            }

            if (ano <= 100) {
                System.out.println(ano + " anos.");
            } else {
                System.out.println("Mais de 1 seculo.");
            }
        }

        sc.close();
    }
}