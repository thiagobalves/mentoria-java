package mentoria.thiagoalves;
import java.util.Scanner;

public class EntreNumeros {

	public static void main(String[] args) {
		Scanner primeiroNumero = new Scanner(System.in);
		Scanner segundoNumero = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int numero1 = primeiroNumero.nextInt();

		System.out.println("Informe o segundo número: ");
		int numero2 = segundoNumero.nextInt();

		primeiroNumero.close();
		segundoNumero.close();

		if(numero1 < numero2) {
			while(numero1 < numero2) {
				System.out.println(numero1);
				numero1++;
			}

		} else {
			while(numero1 > numero2) {
				System.out.println(numero2);
				numero2++;
			}
		}

	}
}
