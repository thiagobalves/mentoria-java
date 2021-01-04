package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Qual o valor do seu salário por hora?");
		double valorHora = numero.nextDouble();
		
		System.out.println("Quantas horas você trabalhou esse mês?");
		double horasTrabalhadas = numero.nextDouble();
		
		numero.close();
		
		double salario = valorHora * horasTrabalhadas;
		
		System.out.println("O seu salário no final do mês será de: R$ " + salario);
	}
}
