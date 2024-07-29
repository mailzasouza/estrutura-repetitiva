package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		x = 1;

		System.out.print("Digite um número: ");
		x = sc.nextInt();

		while (x != 0) {
			System.out.print("Escreva novamente ");
			x = sc.nextInt();

		}
		System.out.println("Fim");
		sc.close();
	}

}
