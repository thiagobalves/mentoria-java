package mentoria.thiagoalves;
import java.util.Scanner;

public class Palavra {
	public static void main(String[] args) {
		Scanner palavraInformada = new Scanner(System.in);
		Scanner letraInformada = new Scanner(System.in);

		System.out.println("Informe a palavra: ");
		String palavra = palavraInformada.next();

		System.out.println("Informe a letra que deseja pesquisar: ");
		String letra = letraInformada.next();

		palavraInformada.close();
		letraInformada.close();
		
		boolean resultado = palavra.contains(letra); 
		
		System.out.println(resultado);
	}

}
