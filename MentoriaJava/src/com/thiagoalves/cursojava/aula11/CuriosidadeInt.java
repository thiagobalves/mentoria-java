package com.thiagoalves.cursojava.aula11;

public class CuriosidadeInt {
	
	public static void main(String[] args) {
		
	int var1 = 2147483647;
		
	int var2 = 100;
	
	System.out.println(var1 + var2);
	
	//caso exceda o limite de capacidade do tipo o valor ser� igual ao menor valor aceito
	
	long cartaoCredito = 1234_5678_9101_1213L; //pode-se utilizar underscore ( _ ) para facilitar a leitura
	
	System.out.println(cartaoCredito);
	
	}

}
