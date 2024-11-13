package AtividadeApo;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Double num1 = 0.0;
		Double num2 = 0.0;
		Double Total = 0.0;
		String operacao;
		Scanner leia = new Scanner(System.in);
		System.out.println("O peração Matematica: ");
		System.out.println("Escola a Operação: Vezes, Menos, Mais, Divisão, Divisão% ");
		operacao = leia.next();
		if (operacao.equalsIgnoreCase("Vezes")) {
			System.out.println("Digite o 1 numero: ");
			num1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			num2 = leia.nextDouble();
			Total = num1 * num2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Mais")) {
			System.out.println("Digite o 1 numero: ");
			num1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			num2 = leia.nextDouble();
			Total = num1 + num2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Menos")) {
			System.out.println("Digite o 1 numero: ");
			num1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			num2 = leia.nextDouble();
			Total = num1 - num2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Divisão") ) {
			System.out.println("Digite o 1 numero: ");
			num1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			num2 = leia.nextDouble();
			Total = num1 / num2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Divisão%") ) {
			System.out.println("Digite o Valor da Porcentagem: ");
			num2 = leia.nextDouble();
			System.out.println("Digite o Valor a Ser Porcentado: ");
			num1 = leia.nextDouble();
			Total = num1 * (num2/ 100.0);
			System.out.println("O rezultado e: " + Total);
		} else {
			System.out.println("Operação Invalida!");
		}
	}
}	


