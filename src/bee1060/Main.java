package bee1060;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int contador = 0;

        for (int i = 1; i <= 6; i++) {
            double numero =  sc.nextDouble();
            if  (numero >= 0) {
                contador++;
            }

        }
        System.out.println(contador + " valores positivos");
    }
}
