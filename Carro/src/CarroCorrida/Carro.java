package CarroCorrida;

public class Carro {
	public Carro (Integer numeroIdentificacao, Double velocidadeMaxima) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.velocidadeMaxima = velocidadeMaxima;
		}
		private Integer numeroIdentificacao;
		private Double velocidadeAtual = 0.0;
		private Double velocidadeMaxima;
		private Piloto piloto;

		public void ligar() {
			System.out.println("Carro Ligado! Vruuummmmmmm!!");
		}

		public void desligar() {
			System.out.println("MMMmmmmm.... Carro Desligado");
		}

		void acelerar() {
			velocidadeAtual += 10 + piloto.getHabilidade() * 0.1;
			if (velocidadeAtual > velocidadeMaxima) {
				velocidadeAtual = velocidadeMaxima;
			}
		}

		void frear(Integer intencidadeFreada) {
			if (intencidadeFreada > 100) {
				intencidadeFreada = 100;
			} else if (intencidadeFreada < 0) {
				intencidadeFreada = 0;
			}
			velocidadeAtual -= intencidadeFreada * 0.25;
			if (velocidadeAtual < 0) {
				intencidadeFreada = 0;
			}
		}
		
		public Integer getNumeroIdentificacao() {
			return numeroIdentificacao;
		}
		
		public void setNumeroIdentificacao(Integer numeroIdentificacao) {
			this.numeroIdentificacao = numeroIdentificacao;
		}
		
		public Piloto getPiloto() {
			return piloto;
		}
		
		public void setPiloto(Piloto piloto) {
			this.piloto = piloto;
		}
		
		public Double getVelocidadeAtual() {
			return velocidadeAtual;
		}
	}
