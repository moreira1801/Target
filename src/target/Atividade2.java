package target;
import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		// Declarando as variáveis
		int n1 = 0, n2 = 1, n3, i, seq = 0;

		// Método de entrada
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		//Zero sempre pertence
		if (num == 0) {
			System.out.println("O numero informado pertence a sequencia de Fibonacci.");
			return;
		}
		//Codigo para a sequencia
		while (true) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			seq++;
		//Verifica se o codigo pertence a sequencia
			if (n3 == num) {
				System.out.println("O numero informado pertence a sequencia de Fibonacci.");
				return;
			} else if (n3 > num) {
				System.out.println("O numero informado nao pertence a sequencia de Fibonacci.");
				return;
			}
		}
	}
}
