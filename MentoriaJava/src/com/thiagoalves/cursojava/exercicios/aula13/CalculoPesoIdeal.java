package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculoPesoIdeal {
	
	public static void main(String[] args) {
		
		Scanner altura = new Scanner(System.in);
		
		System.out.println("Informe a altura da pessoa: ");		
		double alturaPessoa = altura.nextDouble();
		
		
		altura.close();
		
		double pesoIdeal = (72.7 * alturaPessoa) - 58;
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);	
		
	}

}
