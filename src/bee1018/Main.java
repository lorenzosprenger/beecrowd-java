package bee1018;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numSalvo = n;
        int cem = n/100;
        n = n - (cem*100);
        int cinquenta = n/50;
        n = n - (cinquenta*50);
        int vinte = n/20;
        n = n - (vinte*20);
        int dez = n/10;
        n = n - (dez*10);
        int cinco = n/5;
        n = n - (cinco*5);
        int dois = n/2;
        n = n - (dois*2);
        int um = n/1;



        System.out.println(numSalvo);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");


        sc.close();
    }
}