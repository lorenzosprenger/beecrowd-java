package bee1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int maior = Math.max(a, b);
        int menor = Math.min(a, b);

        if (maior%menor==0) {
            System.out.println("Sao Multiplos");
        }else  {
            System.out.println("Nao sao Multiplos");
        }

    }
}
