package CarroCorrida;

public class Contador {
    private int valor;

    public Contador(int valorInicial) {
        this.valor = valorInicial;
    }
    public void incrementar() {
        valor++; 
    }
    public void decrementar() {
        valor--; 
    }
    public void imprimirValor() {
        System.out.println("Valor atual do contador: " + valor);
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}

