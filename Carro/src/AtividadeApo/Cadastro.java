package AtividadeApo;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
  //Uso de chat
	private List<Pessoa> pessoas = new ArrayList<>();
    private static final int MAX_PESSOAS = 100;
    public void cadastrarPessoa(Pessoa pessoa) {
        if (pessoas.size() < MAX_PESSOAS) {
            pessoas.add(pessoa);
            // Uso de chat
            System.out.println("Pessoa cadastrada: " + pessoa.getNome());
        } else {
            System.out.println("Limite de cadastros atingido.");
        }
    }
    public void excluirPessoa(String cpf) {
        boolean removido = pessoas.removeIf(p -> p.getCpf().equals(cpf));
        if (removido) {
            System.out.println("Cadastro com CPF " + cpf + " removido.");
        } else {
            System.out.println("Pessoa com CPF " + cpf + " não encontrada.");
        }
    }
    public void listarPessoas() {
        System.out.println("Pessoas cadastradas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", CPF: " + pessoa.getCpf());
        }
    }
}// não estava funcionando, usei o chata para correção do código 
