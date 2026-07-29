package bee1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        int n = (int) Math.round(valor * 100);

        int cem = n / 10000;
        n %= 10000;

        int cinquenta = n / 5000;
        n %= 5000;

        int vinte = n / 2000;
        n %= 2000;

        int dez = n / 1000;
        n %= 1000;

        int cinco = n / 500;
        n %= 500;

        int dois = n / 200;
        n %= 200;

        int um = n / 100;
        n %= 100;

        int cinquentaCentavos = n / 50;
        n %= 50;

        int vinteCincoCentavos = n / 25;
        n %= 25;

        int dezCentavos = n / 10;
        n %= 10;

        int cincoCentavos = n / 5;
        n %= 5;

        int umCentavo = n;

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(cinquentaCentavos + " moeda(s) de R$ 0.50");
        System.out.println(vinteCincoCentavos + " moeda(s) de R$ 0.25");
        System.out.println(dezCentavos + " moeda(s) de R$ 0.10");
        System.out.println(cincoCentavos + " moeda(s) de R$ 0.05");
        System.out.println(umCentavo + " moeda(s) de R$ 0.01");

        sc.close();
    }
}