package bee1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
        int posicao = 0;

        for (int i = 0; i < 100; i++) {
            int x = sc.nextInt();
            if (x > maior) {
                maior = x;
                posicao = i + 1;
            }
        }
        System.out.println(maior);
        System.out.println(posicao);
    }
}
