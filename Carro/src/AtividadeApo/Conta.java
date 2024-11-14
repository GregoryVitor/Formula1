package AtividadeApo;

public class Conta {
	private Pessoa cliente;
	private String numcont;
	private Double saldo = 0.0;
	private Double limite = 9999.99;

	public Conta(Pessoa cliente, String numcont, Double saldo, Double limite) {
		this.cliente = cliente;
		this.numcont = numcont;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public boolean sacar(Double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Valor sacado com sucesso.");
			return true;
		} else {
			System.out.println("Saldo insuficiente. Vai Trapalhar Vagabundo!!!.");
			return false;
		}
	}
	
	public void depositar(Double valor) {
		if ((saldo + valor) <= limite) {
			saldo += valor;
			System.out.println("Depósito efetuado com sucesso.");
		} else {
			System.out.println("Limite de saldo atingido. Que isso mano, Assaltou um Banco Foi???.");
		}
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public String getNumcont() {
		return numcont;
	}

	public Double getLimite() {
		return limite;
	}

	public Pessoa getCliente() {
		return cliente;
	}
}
