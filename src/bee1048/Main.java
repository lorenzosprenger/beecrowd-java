package bee1048;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float s = 0;
        float r = 0;
        int p = 0;
        float xis = sc.nextFloat();
        if (xis <= 400.00){
            s = (float) (xis * 1.15);
            r = s - xis;
            p = 15;

        }
        if (400.01 <= xis & xis <= 800.00){
            s = (float) (xis * 1.12);
            r = s - xis;
            p = 12;

        }
        if (800.01 <= xis & xis <= 1200.00){
            s = (float) (xis * 1.10);
            r = s - xis;
            p = 10;

        }
        if (1200.01 <= xis & xis <= 2000.00){

            s = (float) (xis * 1.07);
            r = s - xis;
            p = 7;
        }
        if  (xis > 2000.00){
            s = (float) (xis * 1.04);
            r = s - xis;
            p = 4;

        }
        System.out.printf("Novo salario: %.2f%n", s);
        System.out.printf("Reajuste ganho: %.2f%n", r);
        System.out.printf("Em percentual: %s %%%n", p );


    }


}
