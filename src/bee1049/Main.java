package bee1049;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String xis = sc.nextLine();
        String z = sc.nextLine();
        String y = sc.nextLine();

        String a = "";

        if (xis.equals("vertebrado") && z.equals("ave") && y.equals("carnivoro")) {
            a = "aguia";
        } else if (xis.equals("vertebrado") && z.equals("ave") && y.equals("onivoro")) {
            a = "pomba";
        } else if (xis.equals("vertebrado") && z.equals("mamifero") && y.equals("onivoro")) {
            a = "homem";
        } else if (xis.equals("vertebrado") && z.equals("mamifero") && y.equals("herbivoro")) {
            a = "vaca";
        } else if (xis.equals("invertebrado") && z.equals("inseto") && y.equals("hematofago")) {
            a = "pulga";
        } else if (xis.equals("invertebrado") && z.equals("inseto") && y.equals("herbivoro")) {
            a = "lagarta";
        } else if (xis.equals("invertebrado") && z.equals("anelideo") && y.equals("hematofago")) {
            a = "sanguessuga";
        } else if (xis.equals("invertebrado") && z.equals("anelideo") && y.equals("onivoro")) {
            a = "minhoca";
        }

        System.out.println(a);

        sc.close();
    }
}