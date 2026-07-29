package bee1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        int codigo2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();

        double valorPagarPeca1 = numPeca1 * valorPeca1;
        double valorPagarPeca2 = numPeca2 * valorPeca2;

        double ValorTotal = valorPagarPeca1 + valorPagarPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ValorTotal);
    }
}