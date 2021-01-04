package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class CalculoPinturaArea2 {
	
	public static void main(String[] args) {
		
		final int tamanhoLataDeTintaGrande = 18;
		final double tamanhoLataDeTintaPequena = 3.6;
		final double precoDaLataDeTintaGrande = 80.0;
		final double precoDaLatadeTintaPequena = 25.0;
		
		Scanner area = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da �rea a ser pintada (em metros)");
		int areaPintura = area.nextInt();
		
		area.close();
		
		double litrosDeTinta = Math.round(areaPintura / 6);
		
		//calculo lata grande		
		double quantidadeDeLatasGrandes = Math.round(litrosDeTinta / tamanhoLataDeTintaGrande);
		double custoTotalLatasGrandes = quantidadeDeLatasGrandes * precoDaLataDeTintaGrande;
		
		//calculo lata pequena		
		double quantidadeDeLatasPequenas = Math.round(litrosDeTinta / tamanhoLataDeTintaPequena);
		double custoTotalLatasPequenas = quantidadeDeLatasPequenas * precoDaLatadeTintaPequena;
		
		
		System.out.println("Para pintar " + areaPintura + " M�. Voc� vai precisar de " + litrosDeTinta + " litros de tinta.");
		System.out.println("");
		
		//Informa lata grande
		System.out.println("Em latas de 18 litros, ser�o: " + quantidadeDeLatasGrandes + " latas grandes");
		System.out.println("O custo total ser� de R$ " + custoTotalLatasGrandes);
		
		System.out.println("");
		System.out.println("------------------------");
		System.out.println("");
		
		//Informa lata pequena
		System.out.println("Em latas de 3,6 litros, ser�o: " + quantidadeDeLatasPequenas + " latas pequenas");
		System.out.println("O custo total ser� de R$ " + custoTotalLatasPequenas);
		
	}

}
