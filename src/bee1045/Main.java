package bee1045;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double n1 = 1.0;
        double n2 = 1.0;
        double n3 = 1.0;

        if (a >= b && a >= c) {
            n1 = a;
            if (b >= c) {
                n2 = b;
                n3 = c;
            } else {
                n2 = c;
                n3 = b;
            }
        }

        if (b >= a && b >= c) {
            n1 = b;
            if (a >= c) {
                n2 = a;
                n3 = c;
            } else {
                n2 = c;
                n3 = a;
            }
        }

        if (c >= a && c >= b) {
            n1 = c;
            if (a >= b) {
                n2 = a;
                n3 = b;
            } else {
                n2 = b;
                n3 = a;
            }
        }

        if (a == b && b == c) {
            n1 = a;
            n2 = b;
            n3 = c;
        }

        a = n1;
        b = n2;
        c = n3;

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        sc.close();
    }
}