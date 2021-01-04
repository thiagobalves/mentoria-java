package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = nota.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = nota.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = nota.nextDouble();
		
		System.out.println("Informe a quarta nota: ");
		double nota4 = nota.nextDouble();
		
		nota.close();
		
		double mediafinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média final do aluno foi de: " + mediafinal);
	}

}
