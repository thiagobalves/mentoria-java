package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class ConversorCelsiousParaFarenheit {

	public static void main(String[] args) {
		
		Scanner graus = new Scanner(System.in);
		
		System.out.println("Informe o valor que deseja converter para graus Farenheit");
		double grausFarenheit = graus.nextDouble();
		
		graus.close();
		
		double valorConvertido = (grausFarenheit * 1.8) + 32;
		
		System.out.println(grausFarenheit + " graus Farenheit convertidos em Celsious é igual a: " + valorConvertido);
		
	}
}
