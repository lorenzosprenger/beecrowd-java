package bee1094;

public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int coelhos = 0;
        int ratos = 0;
        int sapos = 0;

        for (int i = 0; i < n; i++) {
            int quantidade = sc.nextInt();
            String tipo = sc.next();

            if (tipo.equals("C")) {
                coelhos += quantidade;
            } else if (tipo.equals("R")) {
                ratos += quantidade;
            } else if (tipo.equals("S")) {
                sapos += quantidade;
            }
        }

        int total = coelhos + ratos + sapos;
        double percentualCoelhos = (double) coelhos / total * 100;
        double percentualRatos = (double) ratos / total * 100;
        double percentualSapos = (double) sapos / total * 100;

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
    }
}
