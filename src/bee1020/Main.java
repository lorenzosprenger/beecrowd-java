package bee1020;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idadeEmDias = sc.nextInt();

        int ano = 365;
        int mes = 30;

        int anos = idadeEmDias/ano;
        idadeEmDias = idadeEmDias - anos*ano;
        int meses = idadeEmDias/mes;
        idadeEmDias = idadeEmDias - meses*mes;

        System.out.printf(anos + " ano(s)%n");
        System.out.printf(meses + " mes(es)%n");
        System.out.printf(idadeEmDias + " dia(s)%n");
        sc.close();
    }
}