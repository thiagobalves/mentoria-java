package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class DoisNumeros {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero:");
		int primeiroNumero = numero.nextInt();

		System.out.println("Informe o segundo n�mero:");
		int segundoNumero = numero.nextInt();

		numero.close();

		int resultado = primeiroNumero + segundoNumero;

		System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " � igual a: " + resultado);
	}


}
