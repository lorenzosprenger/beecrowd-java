package bee1061;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = Integer.parseInt(sc.nextLine().split(" ")[1]);

        String[] h1 = sc.nextLine().split(":");

        int hr1 = Integer.parseInt(h1[0].trim());
        int mn1 = Integer.parseInt(h1[1].trim());
        int seg1 = Integer.parseInt(h1[2].trim());

        int temp1 = seg1 + mn1 * 60 + hr1 * 60 * 60 + dia * 24 * 60 * 60;

        int dia2 = Integer.parseInt(sc.nextLine().split(" ")[1]);

        String[] h2 = sc.nextLine().split(":");

        int hr2 = Integer.parseInt(h2[0].trim());
        int mn2 = Integer.parseInt(h2[1].trim());
        int seg2 = Integer.parseInt(h2[2].trim());

        int temp2 = seg2 + mn2 * 60 + hr2 * 60 * 60 + dia2 * 24 * 60 * 60;

        int div = temp2 - temp1;

        int d = div / (24 * 60 * 60);
        div = div % (24 * 60 * 60);

        int h = div / (60 * 60);
        div = div % (60 * 60);

        int m = div / 60;
        div = div % 60;

        int s = div;

        System.out.println(d + " dia(s)");
        System.out.println(h + " hora(s)");
        System.out.println(m + " minuto(s)");
        System.out.println(s + " segundo(s)");

        sc.close();
    }
}