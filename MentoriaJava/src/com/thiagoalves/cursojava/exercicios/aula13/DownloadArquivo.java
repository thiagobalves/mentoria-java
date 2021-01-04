package com.thiagoalves.cursojava.exercicios.aula13;
import java.util.Scanner;

public class DownloadArquivo {

	public static void main(String[] args) {
		
		Scanner arquivoDownload = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo em MB");
		double tamanhoArquivo = arquivoDownload.nextDouble();
		
		Scanner velocidadeMbps = new Scanner(System.in);
		
		System.out.println("Informe a velocidade da internet em Mbps");
		int velocidadeInternet = velocidadeMbps.nextInt();
		
		arquivoDownload.close();
		velocidadeMbps.close();
		
		double tempoDeDownload = tamanhoArquivo / velocidadeInternet;
	
		System.out.println("Tempo de download: " + tempoDeDownload);
		
	}
}
