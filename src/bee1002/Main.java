package bee1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double n = 3.14159;
        double area = n*(A*A);

        System.out.printf("A=%.4f%n", area);
    }
}
