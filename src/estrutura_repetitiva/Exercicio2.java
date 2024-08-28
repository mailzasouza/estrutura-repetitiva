package estrutura_repetitiva;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número x: ");
		int x = sc.nextInt();
		System.out.println("Digit o número y: ");
		int y = sc.nextInt();
		
		while (x != 0 & y != 0 ) {
			if (x > 0 & y > 0) {
			System.out.println("primeiro");
		}
			else if (x > 0 & y < 0) {
			System.out.println("quarto");
		}
			else if (x < 0 & y < 0) {
				System.out.println("segundo");
			}
			else {
				System.out.println("terceiro");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		
		}
		
		
		
		
		sc.close();		
		}
	}


