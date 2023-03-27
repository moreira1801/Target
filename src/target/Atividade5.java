package target;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva uma palavra: ");
		String palavra =sc.nextLine();
		
		String invertida = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {
		    invertida += palavra.charAt(i);
		}

		System.out.println(invertida);
	}

}
