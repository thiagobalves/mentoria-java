package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class ConversorFarenheitParaCelsius {
	
	public static void main(String[] args) {
		
		Scanner graus = new Scanner(System.in);
		
		System.out.println("Informe o valor a ser convertido: ");
		double grausFarenheit = graus.nextDouble();
		
		graus.close();
		
		double grausCelsious = (grausFarenheit - 32) / 1.8;
		
		System.out.println(grausFarenheit + " graus Farenheit é igual a: " + grausCelsious + " graus Celsious");		
		
	}

}
