package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculoInteiroReal {
	
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero inteiro: ");
		int primeiroNumero = numero.nextInt();
		
		System.out.println("Informe o segundo n�mero inteiro: ");
		int segundoNumero = numero.nextInt();
		
		System.out.println("Infome um n�mero real: ");
		double numeroReal = numero.nextDouble();
		
		numero.close();
		
		int resultado1 = (primeiroNumero * 2) + (segundoNumero / 2);		
		System.out.println("O dobro do primeiro com metade do segundo � igual a: " + resultado1);
		
		double resultado2 = (primeiroNumero * 3) + numeroReal;		
		System.out.println("A soma do triplo do primeiro com o terceiro � igual a: " + resultado2);
		
		double resultado3 = Math.pow(numeroReal, 3);
		System.out.println("O terceiro n�mero elevado ao cubo � igual a: " + resultado3);		
		
	}

}
