package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class PedidoNumero {
	
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Infome um n�mero:");
		int numeroInformado = numero.nextInt();
		
		numero.close();
		
		System.out.println("O n�mero informado foi: " + numeroInformado);		
	}

}
