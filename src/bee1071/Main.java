package bee1071;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = 0;
        if(x>y){
            int temp = x;
            x = y;
            y = temp;
        }

        for(int i=x+1;i<y;i++){
            if(i%2 != 0){
                sum+=i;

            }
        }
        System.out.println(sum);

    }
}
