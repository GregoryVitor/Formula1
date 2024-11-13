package AtividadeApo;
public class Pessoa {
   private String nome;
   private int idade;
   private String cpf;
   private Endereço endereco;
   public Pessoa(String nome, int idade, String cpf) {
       this.nome = nome;
       this.idade = idade;
       this.cpf = cpf;
   }
   public Pessoa(String nome, int idade, String cpf, Endereço endereco) {
       this(nome, idade, cpf);
       this.endereco = endereco;
   }
   // Getters
   public String getNome() {
       return nome;
   }
   public int getIdade() {
       return idade;
   }
   public String getCpf() {
       return cpf;
   }
   public Endereço getEndereco() {
       return endereco;
   }
}
