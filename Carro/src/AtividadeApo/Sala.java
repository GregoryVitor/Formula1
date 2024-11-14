package AtividadeApo;
public class Sala {
   private Pessoa[] alunos;
   private String nomeSala;
   private int numAlunos;
   public Sala(String nomeSala) {
       this.nomeSala = nomeSala;
       this.alunos = new Pessoa[20];
       this.numAlunos = 0;
   }
   public boolean adicionarAluno(Pessoa aluno) {
       if (numAlunos < 20) {
           alunos[numAlunos] = aluno;
           numAlunos++;
           return true;
       } else {
           System.out.println("Sala " + nomeSala + " cheia. Não é possível adicionar mais alunos.");
           return false;
       }
   }
   public boolean removerAluno(Pessoa aluno) {
       for (int i = 0; i < numAlunos; i++) {
           if (alunos[i].equals(aluno)) {
           	
               for (int j = i; j < numAlunos - 1; j++) {
                   alunos[j] = alunos[j + 1];
               }
               alunos[numAlunos - 1] = null; 
               numAlunos--; 
               return true;
           }
       }
       System.out.println("Aluno não encontrado na sala " + nomeSala);
       return false;
   }
   public void listarAlunos() {
       System.out.println("Alunos na " + nomeSala + ":");
       for (int i = 0; i < numAlunos; i++) {
           System.out.println(alunos[i].getNome());
       }
   }
   public String getNomeSala() {
       return nomeSala;
   }
   public Pessoa[] getAlunos() {
       return alunos;
   }
   public int getNumAlunos() {
       return numAlunos;
   }
}
