package bee2709;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            try {
                int M = sc.nextInt();

                int[] moedas = new int[M];

                for (int i = 0; i < M; i++) {
                    moedas[i] = sc.nextInt();
                }

                int n = sc.nextInt();

                int soma = 0;

                // Percorre o array de trás para frente,
                // pulando de n em n
                for (int j = M - 1; j >= 0; j -= n) {
                    soma += moedas[j];
                }

                if (soma == 0 || soma == 1) {
                    System.out.println("Bad boy! I’ll hit you.");
                } else {

                    boolean primo = true;

                    for (int i = 2; i <= soma / 2; i++) {
                        if (soma % i == 0) {
                            primo = false;
                            break;
                        }
                    }

                    if (primo) {
                        System.out.println(
                                "You’re a coastal aircraft, Robbie, a large silver aircraft."
                        );
                    } else {
                        System.out.println("Bad boy! I’ll hit you.");
                    }
                }

            } catch (Exception e) {
                break;
            }
        }

        sc.close();
    }
}