package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class PeixariaJoao {
	
	public static void main(String[] args) {
		
		final double multa = 4.0;
		final int pesoMaximo = 50;
		
		Scanner peixe = new Scanner(System.in);
		
		System.out.println("Qual o peso do peixe?");
		double pesoPeixe = peixe.nextDouble();
		
		peixe.close();
		
		if (pesoPeixe > pesoMaximo) {
			
			double pesoExcedente = pesoPeixe - 50;
			double valorMulta = pesoExcedente * multa;
			
			System.out.println("Seu peixe excedeu " + pesoExcedente + "kg. O valor da multa � de: R$ " + valorMulta);
			
		} else {
			System.out.println("Seu peixe pesa " + pesoPeixe + "kg. Voc� n�o excedeu o peso m�ximo de " + pesoMaximo +
					"kg e n�o tem multa a pagar.");
		}
		
		
		
	}

}
