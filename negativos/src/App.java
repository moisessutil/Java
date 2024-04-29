import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você deseja digitar?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            System.out.println("Digite um numero inteiro: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");
        for (int i=0; i<vect.length; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
