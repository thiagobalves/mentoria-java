package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculaAreaQuadrado {
	
	public static void main(String[] args) {
		
		Scanner numeroInformado = new Scanner(System.in);
		
		System.out.println("Informe o valor de um dos lado do quadrado: ");
		double valorLado = numeroInformado.nextDouble();
		
		numeroInformado.close();
		
		double areaQuadrado = Math.pow(valorLado, 2);
		double dobroAreaQuadrado = areaQuadrado * 2;
		
		System.out.println("A �rea do quadrado � igual a: " + areaQuadrado);
		System.out.println("o dobro da �rea do quadrado � igual a: " + dobroAreaQuadrado);
		
		
	}

}
