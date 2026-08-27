package bee1066;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num % 2 == 0) {
                par++;
            } else{
                impar++;
            }
            if (num >= 1) {
                positivo++;
            }else if (num <= -1) {
                negativo++;
            }

        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
