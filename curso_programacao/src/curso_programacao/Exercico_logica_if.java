package curso_programacao;

import java.util.Scanner;

public class Exercico_logica_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int a;
		int b;
		int c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("O maior numero informado dos 3 é " + a);
		} else if (b > c) {
			System.out.println("O maior numero informado dos 3 é " + b);
		} else {
			System.out.println("O maior numero informado dos 3 é " + c);
		}
		
		sc.close();

	}

}
