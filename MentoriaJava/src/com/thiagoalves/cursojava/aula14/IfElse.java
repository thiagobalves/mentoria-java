package com.thiagoalves.cursojava.aula14;
import java.util.Scanner;

public class IfElse {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Informe a sua idade:");
		int idade = scan.nextInt();
			
		if(idade >= 18) {
			System.out.println("� maior de idade!");
		} else {
			System.out.println("� menor de idade!");
		}*/
		
		System.out.println("Entre com o pre�o do item:");
		double valor = scan.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Est� barato, pode comprar!");
		} else if (valor > 10 && valor < 15) {
			System.out.println("Pedir desconto!");
		} else if (valor <= 15 && valor < 17) {
			System.out.println("Pesquisar mais!");
		} else {
			System.out.println("Muito caro. N�o comprar!");
		}
		
		scan.close();
		
	}

}
