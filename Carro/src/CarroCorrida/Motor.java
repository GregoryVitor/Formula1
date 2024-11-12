package CarroCorrida;

public class Motor {

	private Integer potencia;

	public Motor(Integer potencia) {
		setPotencia(potencia);
	}

	public void setPotencia(Integer potencia) {
		if (potencia > 100) {
			this.potencia = 100;
		} else if (potencia < 0) {
			this.potencia = 0;
		} else {
			this.potencia = potencia;
		}
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void mostrarPotencia() {
		System.out.println("Potência do motor: " + potencia + " HP");
	}
}
