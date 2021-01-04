package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculoPesoIdeal2 {
	
	public static void main(String[] args) {
		
		Scanner altura = new Scanner(System.in);
		
		System.out.println("Informe a altura da pessoa:");
		double alturaPessoa = altura.nextDouble();
		
		Scanner sexo = new Scanner(System.in);
		
		System.out.println("Informe o sexo: 1 para homem ou 2 para mulher!");
		int sexoPessoa = sexo.nextInt();
		
		Scanner peso = new Scanner(System.in);
		
		System.out.println("Qual o seu peso?");
		double pesoPessoa = peso.nextDouble();
		
		altura.close();
		sexo.close();
		peso.close();		
		
		if(sexoPessoa == 1) {
			double pesoIdeal = (72.7 * alturaPessoa) - 58;
			
			if (pesoIdeal > pesoPessoa) 
			{ 
				System.out.println("Você é homem e tem: " + alturaPessoa + " de altura. Seu peso: " + pesoPessoa +
						". Seu peso ideal é: " + pesoIdeal + " você está abaixo do peso ideal!");
			} else {
				System.out.println("Você é homem e tem: " + alturaPessoa + " de altura. Seu peso: " + pesoPessoa +
						". Seu peso ideal é: " + pesoIdeal + " você está acima do peso ideal!");
			}
			
		} else {
			double pesoIdeal = (62.1 * alturaPessoa) - 44.7;
			
			if (pesoIdeal > pesoPessoa) 
			{				
				System.out.println("Você é mulher e tem: " + alturaPessoa + " de altura. Seu peso: " + pesoPessoa +
						". Seu peso ideal é: " + pesoIdeal + " você está abaixo do peso ideal!");
			} else {
				System.out.println("Você é mulher e tem: " + alturaPessoa + " de altura. Seu peso: " + pesoPessoa +
						". Seu peso ideal é: " + pesoIdeal + " você está acima do peso ideal!");
			}
			
		}
		
	}

}
