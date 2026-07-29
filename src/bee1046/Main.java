package bee1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini = sc.nextInt();
        int fim = sc.nextInt();
        int t = 0;
        if (ini < fim){
            t = fim - ini;
        } else {
            t = (24 - ini) + fim;
        }
        System.out.printf("O JOGO DUROU %d HORA(S)%n", t);
        }
}
