package curso_programacao;

import java.util.Locale;

public class ex_de_fixacao {

	public static void main(String[] args) {
		String produto1 = "Computer";
		String produto2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double preco1 = 2100.00;
		double preco2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s, which price is R$%.2f%n", produto1, preco1);
		System.out.printf("%s, which price is R$%.2f%n", produto2, preco2);
		System.out.println("");
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println("");
		System.out.printf("Measue with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
