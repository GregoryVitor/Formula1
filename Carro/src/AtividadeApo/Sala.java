package AtividadeApo;

import java.util.Scanner;

public class Sala {

	public static void main(String[] args) {
		int numA = 0;
		final int LimiAlu = 10;
		for (int i = 1; i <= 12; i++) {
			if (numA < LimiAlu) {
				numA++;
				System.out.println("Aluno " + i + " adicionado com sucesso!");
			} else {
				System.out.println("O limite de alunos foi atingido!");
			}
		}
	}
}
