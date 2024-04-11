package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class telefonia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos minutos foram consumidos?");
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("O valor a ser pago foi de R$ %.2f", conta);
		
		sc.close();
	}

}
