package apllication;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos quartos serão alugados: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
