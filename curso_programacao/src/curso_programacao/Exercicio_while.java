package curso_programacao;

public class Exercicio_while {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 0;
		
		while(x > 2) {
			System.out.println(x);
			
			y = y + x;
			x = x - 1;
		}
		
		// Oque deve ser imprimido
		// y vai ficar com valor de 5
		// x vai imprimir 4 3 2, e a condição vai ser falsa e vai encerrar o loop.
	}

}
