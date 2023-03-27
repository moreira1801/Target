package target;
import java.util.Locale;

public class Atividade4 {
	public static void main (String [] args) {
		Locale.setDefault(Locale.US);
		//Declarando as variaveis
		
		double SP = 67836.43;
		double RJ = 36678.66;
		double MG = 29229.66;
		double ES = 27165.48;
		double OT = 19849.53;
		
		
		//Somando o faturamento para obter os total mensal
		double total = SP + RJ + MG + ES + OT;
		
		//Calculando o percentual de cada estado
		double percentualSP = SP / total * 100;
		System.out.printf("Sao Paulo:  %.2f%%\n", percentualSP);
		
		double percentualRJ = RJ / total * 100;
		System.out.printf("Rio de Janeiro: %.2f%%\n", percentualRJ);
		
		double percentualMG = MG / total * 100;
		System.out.printf("Minas Gerais: %.2f%%\n", percentualMG);
		
		double percentualES = ES / total * 100;
		System.out.printf("Espirito Santo: %.2f%%\n", percentualES);
		
		double percentualOT = OT / total * 100;
		System.out.printf("Outros: %.2f%%\n", percentualOT);
		
		
		
		
	}
}
