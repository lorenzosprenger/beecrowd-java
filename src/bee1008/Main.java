package bee1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int quantidadeDeHoras = sc.nextInt();
        int valorRecebe = sc.nextInt();
        double horasTrabalhadas = sc.nextDouble();


        double salario = valorRecebe * horasTrabalhadas;

        System.out.printf("NUMBER = %s%n",quantidadeDeHoras);
        System.out.printf("SALARY = U$ %.2f%n",salario);

    }
}