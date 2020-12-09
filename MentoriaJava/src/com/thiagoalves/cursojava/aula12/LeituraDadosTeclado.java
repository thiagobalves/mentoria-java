package com.thiagoalves.cursojava.aula12;
import java.util.Scanner;

public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
				
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.println("Informe a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura);
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bicho de estima��o");
		String nome = scan.next();
		int suaIdade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		double suaAltura = scan.nextDouble();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Voc� informou os seguintes valores");
		System.out.println("Primeiro nome: " + nome);
		System.out.println("Idade: " + suaIdade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Altura: " + suaAltura);
		System.out.println("Tem pet?: " + temPet);
		
		scan.close();
		
	}

}