package target;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número de dias do mês: ");
		int numDias = sc.nextInt();

		double[] faturamentoDiario = new double[numDias];

		for (int i = 0; i < numDias; i++) {
			System.out.printf("Digite o faturamento do dia %d: ", i + 1);
			faturamentoDiario[i] = sc.nextDouble();
		}

		// Menor valor de faturamento diário
		double menorFaturamento = faturamentoDiario[0];
		for (int i = 1; i < numDias; i++) {
			if (faturamentoDiario[i] < menorFaturamento) {
				menorFaturamento = faturamentoDiario[i];
			}
		}

		// Maior valor de faturamento diário
		double maiorFaturamento = faturamentoDiario[0];
		for (int i = 1; i < numDias; i++) {
			if (faturamentoDiario[i] > maiorFaturamento) {
				maiorFaturamento = faturamentoDiario[i];
			}
		}

		// Média mensal de faturamento diário
		double mediaMensal = 0.0;
		for (int i = 0; i < numDias; i++) {
			mediaMensal += faturamentoDiario[i];
		}
		mediaMensal /= numDias;

		// Número de dias com faturamento diário superior à média mensal
		int diasAcimaDaMedia = 0;
		for (int i = 0; i < numDias; i++) {
			if (faturamentoDiario[i] > mediaMensal) {
				diasAcimaDaMedia++;
			}
		}

		// Resultado
		System.out.printf("O menor valor de faturamento diário foi R$ %.2f\n", menorFaturamento);
		System.out.printf("O maior valor de faturamento diário foi R$ %.2f\n", maiorFaturamento);
		System.out.printf("%d dias no mês tiveram faturamento diário superior à média mensal de R$ %.2f\n",
				diasAcimaDaMedia, mediaMensal);
	}
}
