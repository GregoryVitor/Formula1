package CarroCorrida;

public class Carro {
    
    private Integer numeroIdentificacao;
    private Double velocidadeAtual;
    private Double velocidadeMaxima;
    private Piloto piloto;
    private Motor motor;
    public Carro(Integer numeroIdentificacao, Double velocidadeMaxima, Motor motor) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0.0;
        this.motor = motor;
    }
 
    public void ligar() {
        System.out.println("Carro Ligado! Vruuummmmmmm!!");
    }

    public void desligar() {
        System.out.println("MMMmmmmm.... Carro Desligado");
    }

    public void acelerar() {
        if (piloto != null) {
            velocidadeAtual += 10 + piloto.getHabilidade() * 0.1;
        } else {
            velocidadeAtual += 10; 
        }
        if (motor != null) {
            velocidadeAtual += motor.getPotencia() * 0.10;
        }
        if (velocidadeAtual > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        }
    }

    public void frear(Integer intensidadeFreada) {
        if (intensidadeFreada > 100) {
            intensidadeFreada = 100;
        } else if (intensidadeFreada < 0) {
            intensidadeFreada = 0;
        }
        velocidadeAtual -= intensidadeFreada * 0.25;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0.0;
        }
    }
    public Integer getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(Integer numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}

