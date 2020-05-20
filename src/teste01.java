import java.util.Locale;
import java.util.Scanner;

public class teste01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Leitura da largura com validação

		double largura, altura;
		largura = 0;
		altura = 0;

		System.out.printf("Digite a largura do retângulo: ");
		largura = sc.nextDouble();
		while (largura <= 0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		// Leitura da altura com validação
		
		System.out.printf("Digite a altura do retângulo: ");
		
		altura = sc.nextDouble();
		while (altura <= 0) {
			System.out.printf("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}

		
		System.out.println();
		System.out.println("MENU");
		System.out.println("1 - Mostrar area");
		System.out.println("2 - Mostrar perimetro");
		System.out.println("3 - Sair");
		
		
		
		
		sc.close();
	}

}
