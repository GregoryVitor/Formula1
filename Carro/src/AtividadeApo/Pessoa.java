package AtividadeApo;

import java.io.InputStream;

public class Pessoa {
   
    private String nome;
    private Integer idade;
    private Integer cpf;

    public Pessoa(String nome, Integer idade, Integer cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
     	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + "]";
    }
}
