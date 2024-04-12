package application;

import java.util.Scanner;

import entities.Retangulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.printf("Insira a altura: ");
		retangulo.altura = sc.nextDouble();
		System.out.printf("Insira a largura: ");
		retangulo.largura = sc.nextDouble();
		
		System.out.println();
		System.out.println("Area: " + retangulo.area());
		System.out.println("Perimetro: " + retangulo.perimetro());
		System.out.println("Diagonal: " + retangulo.diagonal());
		
		
		sc.close();
	}

}
