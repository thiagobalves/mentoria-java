package mentoria.thiagoalves;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner numeroInformado = new Scanner(System.in);

		System.out.println("Informe um número: ");		
		int numero = numeroInformado.nextInt();
		numeroInformado.close();

		if(numero % 2 == 0) {
			System.out.println("O numéro " + numero + " é par!");
		} else {
			System.out.println("O número " + numero + " é impar!");
		}		
	}
}
