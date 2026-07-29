package bee1042;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));
        int meio = (a + b + c) - menor - maior;


        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
