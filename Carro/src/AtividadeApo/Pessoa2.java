package AtividadeApo;
public class Pessoa2 {
	    public static void main(String[] args) {
	        Pessoa pessoa1 = new Pessoa(null, 0, null, null);
	        Pessoa pessoa2 = new Pessoa(null, 0, null);
	        System.out.println("Pessoa 1:");
	        System.out.println("Nome: " + pessoa1.getNome());
	        System.out.println("Idade: " + pessoa1.getIdade());
	        System.out.println("CPF: " + pessoa1.getCpf());
	        System.out.println("\nPessoa 2:");
	        System.out.println("Nome: " + pessoa2.getNome());
	        System.out.println("Idade: " + pessoa2.getIdade());
	        System.out.println("CPF: " + pessoa2.getCpf());
	    }
		public String getNome() {
			return null;
		}
	}