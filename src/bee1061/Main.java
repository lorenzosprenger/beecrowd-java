package bee1061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia ");
        int diaInicio = sc.nextInt();

        int horaInicio = sc.nextInt();
        sc.next(); // consome ":"
        int minInicio = sc.nextInt();
        sc.next(); // consome ":"
        int segInicio = sc.nextInt();

        System.out.print("Dia ");
        int diaFim = sc.nextInt();

        int horaFim = sc.nextInt();
        sc.next(); // consome ":"
        int minFim = sc.nextInt();
        sc.next(); // consome ":"
        int segFim = sc.nextInt();

        // Conversão para segundos
        int totalSegInicio = segInicio + (minInicio * 60) + (horaInicio * 3600) + (diaInicio * 86400);
        int totalSegFim = segFim + (minFim * 60) + (horaFim * 3600) + (diaFim * 86400);

        int duracaoSegundos = totalSegFim - totalSegInicio;

        int dias = duracaoSegundos / 86400;
        int resto = duracaoSegundos % 86400;
        int horas = resto / 3600;
        resto = resto % 3600;
        int minutos = resto / 60;
        int segundos = resto % 60;

        System.out.println(dias + " dia(s)");
        System.out.println(horas + " hora(s)");
        System.out.println(minutos + " minuto(s)");
        System.out.println(segundos + " segundo(s)");

        sc.close();
    }
}