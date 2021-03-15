package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.Start();
		
	}

	private void Start() {
		
		Scanner scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		if (idade > 20) {
			System.out.println("Idade maior que 20");
		} else if (idade > 12 && idade < 17) {
			System.out.println("Idade > 12 e < 17");
		} else if (idade == 7 || idade < 5) {
			System.out.println("Idade = 7 ou < 5");
		} else {
			System.out.println("Outra combinação.");
		}
		
		
	}

}
