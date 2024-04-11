package curso_programacao;

import java.util.Scanner;

public class funcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira três número: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a , b, c);
	
		resultado(maior);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
	}
	
	public static void resultado(int valor) {
		System.out.println("Maior valor = " + valor);
	}

}
