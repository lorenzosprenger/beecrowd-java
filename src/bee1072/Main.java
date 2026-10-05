
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int inCount = 0;
        int outCount = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20) {
                inCount++;
            } else {
                outCount++;
            }
        }

        System.out.println(inCount + " in");
        System.out.println(outCount + " out");

        scanner.close();
    }
}
