package estrutura_repetitiva;

public class Exercicioteste {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		x = 2;
		y = 10;
		
		System.out.println("Olá");
		
		while (x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;
		}

	}

}
