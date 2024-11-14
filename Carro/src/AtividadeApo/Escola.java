package AtividadeApo;

public class Escola {
    private String nome;
    private String cnpj;
    private Sala[] salas;
    private int numSalas;
    public Escola(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.salas = new Sala[20]; 
        this.numSalas = 0;  
    }
    public boolean adicionarSala(Sala sala) {
        if (numSalas < 20) {
            salas[numSalas] = sala;  
            numSalas++; 
            System.out.println("Sala " + sala.getNomeSala() + " adicionada com sucesso.");
            return true;
        } else {
            System.out.println("Número máximo de salas atingido.");
            return false;
        }
    }
    public boolean transferirAluno(Sala origem, Sala destino, Pessoa aluno) {
        if (origem.removerAluno(aluno)) { 
            return destino.adicionarAluno(aluno); 
        }
        return false;
    }
    public void listarSalas() {
        for (int i = 0; i < numSalas; i++) {
            salas[i].listarAlunos();
        }
    }
    public String getNome() {
        return nome;
    }
    public String getCnpj() {
        return cnpj;
    }
    public int getNumSalas() {
        return numSalas;
    }
}

