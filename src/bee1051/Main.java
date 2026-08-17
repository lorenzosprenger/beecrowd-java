package bee1051;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double i = 0.0;

        if (x <= 2000.00) {
            System.out.println("Isento");
        } else {
            if (x <= 3000.00) {
                double r8 = x - 2000.00;
                i = r8 * 0.08;
            } else if (x <= 4500.00) {
                double i8 = 1000.00 * 0.08;
                double r18 = x - 3000.00;
                i = i8 + (r18 * 0.18);
            } else {
                double i8 = 1000.00 * 0.08;
                double i18 = 1500.00 * 0.18;
                double r28 = x - 4500.00;
                i = i8 + i18 + (r28 * 0.28);
            }

            System.out.printf("R$ %.2f%n", i);
        }

        sc.close();
    }
}
