package bee1019;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int h = n / 3600;
        n = n - h * 3600;

        int m = n / 60;
        n = n - m * 60;

        int s = n;


        System.out.println(h + ":" + m + ":" + s);
        sc.close();
    }
}