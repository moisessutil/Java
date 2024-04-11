package curso_programacao;

import java.util.Scanner;

public class while_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			
			System.out.println("Digite um número:");
			x = sc.nextInt();
		}
		
		System.out.printf("A soma dos números foi de %d", soma);
		
		sc.close();
	}

}
