package bee1065;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            numero = input.nextInt();
            if (numero % 2 == 0) {
                contador++;
            }
        }

        System.out.println(contador + " valores pares");

    }
}
