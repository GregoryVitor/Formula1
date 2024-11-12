package AtividadeApo;

import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int numPessoas = 2;
        Pessoa[] pessoas = new Pessoa[numPessoas];
        for (int i = 0; i < numPessoas; i++) {
            pessoas[i] = new Pessoa();
            
            System.out.println("Pessoa " + (i + 1) + ":");
            
            System.out.print("Qual o seu nome? ");
            pessoas[i].Nome = leia.nextLine();

            System.out.print("Qual a sua idade? ");
            pessoas[i].Idade = leia.nextInt();

            System.out.print("Qual o seu CPF? ");
            pessoas[i].CPF = leia.nextInt();
            
            leia.nextLine();
        }
        for (int i = 0; i < numPessoas; i++) {
            System.out.println("\nPessoa " + (i + 1) + ":");
            System.out.println("Nome: " + pessoas[i].Nome);
            System.out.println("Idade: " + pessoas[i].Idade);
            System.out.println("CPF: " + pessoas[i].CPF);
        }
    }
}
