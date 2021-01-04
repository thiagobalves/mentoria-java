package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalcularAreaCirculo {

	public static void main(String[] args) {
		
		Scanner raio = new Scanner(System.in);
		
		System.out.println("informe o raio do círculo:");
		double raioInformado = raio.nextInt();
		
		raio.close();
		
		double calculoDaArea = Math.PI * (Math.pow(raioInformado, 2));		
		
		System.out.println("A área do círculo é de: " + calculoDaArea);
		
	}
	
}
