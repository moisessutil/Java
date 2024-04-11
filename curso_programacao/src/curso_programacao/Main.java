package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 49;
		double x = 48.789456;
		
		String nome = "Maria";
		int idade = 40;
		double salario = 3500.50;
		
		System.out.println(y);
		System.out.println(x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("Bom dia!");
		System.out.println("Resultado = " + y + " Metros");
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, salario);

	}

}
