package bee1074;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            // -1 se x for negativo, 0 se for zero e 1 se for positivo
            int sinal = Integer.compare(x, 0);

            switch (sinal) {
                case 0:
                    resultado.append("NULL\n");
                    break;

                case 1:
                    // Número positivo
                    switch (x % 2) {
                        case 0:
                            resultado.append("EVEN POSITIVE\n");
                            break;
                        default:
                            resultado.append("ODD POSITIVE\n");
                            break;
                    }
                    break;

                case -1:
                    // Número negativo
                    switch (x % 2) {
                        case 0:
                            resultado.append("EVEN NEGATIVE\n");
                            break;
                        default:
                            resultado.append("ODD NEGATIVE\n");
                            break;
                    }
                    break;
            }
        }

        System.out.print(resultado);

        scanner.close();
    }
}