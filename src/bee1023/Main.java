package bee1023;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cidade = 1;

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            if (cidade > 1) {
                System.out.println();
            }

            TreeMap<Integer, Integer> mapa = new TreeMap<>();

            int totalMoradores = 0;
            int totalConsumo = 0;

            for (int i = 0; i < n; i++) {

                int moradores = sc.nextInt();
                int consumo = sc.nextInt();

                totalMoradores += moradores;
                totalConsumo += consumo;

                int consumoPessoa = consumo / moradores;

                mapa.put(
                        consumoPessoa,
                        mapa.getOrDefault(consumoPessoa, 0) + moradores
                );
            }

            System.out.println("Cidade# " + cidade + ":");

            boolean primeiro = true;

            for (Map.Entry<Integer, Integer> item : mapa.entrySet()) {

                if (!primeiro) {
                    System.out.print(" ");
                }

                System.out.print(item.getValue() + "-" + item.getKey());

                primeiro = false;
            }

            System.out.println();

            double media = (double) totalConsumo / totalMoradores;
            media = Math.floor(media * 100) / 100.0;

            System.out.printf("Consumo medio: %.2f m3.%n", media);

            cidade++;
        }

        sc.close();
    }
}