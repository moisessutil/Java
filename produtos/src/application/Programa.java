package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Insira os produtos: ");
		System.out.print("Nome: ");
		produto.name = sc.next();
		System.out.print("Preço: ");
		produto.price = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Produtos: " + produto);
		
		System.out.println();
		System.out.printf("Insira a quantidade de produtos que deseja adicionar: ");
		int quantity = sc.nextInt();
		produto.addProducts(quantity);
		
		System.out.println();
		System.out.println("Produtos Atualizados: " + produto);
		
		System.out.println();
		System.out.printf("Insira a quantidade de produtos que deseja remover: ");
		int remove = sc.nextInt();
		produto.removeProducts(remove);
		
		System.out.println();
		System.out.println("Produtos Atualizados: " + produto);
				
		
		sc.close();
	}

}
