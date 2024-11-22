package curso_programacao;

public class Exercicio_while {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		while(x > 2) {
			//System.out.println(x);
			
			y = y + x;
			x = x - 1;
		}
		
		// Oque deve ser imprimido
		// y vai ficar com valor de 5
		// x vai imprimir 5 4 3, e a condição vai ser falsa e vai encerrar o loop.
		
		
		int a = 2;
		int b = 0;
		
		while (a < 60) {
			System.out.println(a);
			System.out.println(b);

			a = a * 2;
			b = b + 10;
		}
		
		// O a vai começar imprimindo 2 na tela, e vai imprimir 2, 4, 8, 16, 32 e nao vai imprimir o 
		// 64 por que vai ser falsa a condição do while
		
		// O b começa imprimindo o 0,  e vai 10 20 30 40 e para por que a condição do a é falsa.
		
		
		
		
		
	}

}
