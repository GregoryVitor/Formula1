package AtividadeApo;

import java.util.Scanner;

public class TestePessoa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		for (int i = 0; i < 2; i++) {
			System.out.println("Qual o seu nome? ");
			pessoa1.Nome = leia.next();
			System.out.println("Qual a sua idade? ");
			pessoa1.Idade = leia.nextInt();
			System.out.println("Qual o seu CPF? ");
			pessoa1.CPF = leia.nextInt();

		}
	}
}
