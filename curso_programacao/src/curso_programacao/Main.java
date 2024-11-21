package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int y;
		int x;
		
		y = sc.nextInt();
		x = sc.nextInt();
		int soma = y + x;
		
		System.out.println("Ola Mundo");
		
		System.out.println("O primeiro valor é " + y);
		System.out.println("O segundo valor é " + x);
		System.out.println("O valor da soma do primeiro valor mais o segundo valor é " + soma);
		
		
        sc.close();

	}

}