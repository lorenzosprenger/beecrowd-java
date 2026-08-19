package bee1052;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();

        List<String> months = List.of(
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        );

        System.out.println(months.get(mes - 1));

        sc.close();
    }
}
