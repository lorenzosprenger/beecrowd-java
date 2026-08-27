package bee1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int contador = 0;
        int i=num;

        while (contador < 6){
            if (i%2 == 1){
                System.out.println(i);
                i++;
                contador++;
            }else{
                i++;
            }


        }
    }
}
