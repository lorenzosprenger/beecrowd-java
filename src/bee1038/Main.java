package bee1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod =  sc.nextInt();
        int quantidade = sc.nextInt();

        if (cod == 1){
            double preco = quantidade * 4.0;
            System.out.printf("Total: R$ %.2f%n", preco);
        } if (cod == 2){
            double preco = quantidade * 4.5;
            System.out.printf("Total: R$ %.2f%n", preco);
        } if (cod == 3){
            double preco = quantidade * 5.0;
            System.out.printf("Total: R$ %.2f%n", preco);
        } if (cod == 4){
            double preco = quantidade * 2.0;
            System.out.printf("Total: R$ %.2f%n", preco);
        }  if (cod == 5){
            double preco = quantidade * 1.5;
            System.out.printf("Total: R$ %.2f%n", preco);
        }





        sc.close();
    }
}