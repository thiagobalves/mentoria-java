package com.thiagoalves.cursojava.aula13;

public class CurtoCircuito {
	
	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		boolean resultado1 = falso & verdadeiro;
		//ao ultilizar o curto circuito && quando o primeiro dado � falso, ele ignora a compara��o com o segundo dado, pois o resultado ser� falso.
		boolean resultado2 = falso && verdadeiro; 
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}

}
