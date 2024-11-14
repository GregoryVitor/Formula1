package CarroCorrida;

public class Corrida {

	public static void main(String[] args) {
		Carro carroEquipeVelocidade = new Carro(100.0);
		Carro carroEquipeTrapaceiros = new Carro(100.0);
		
		Piloto pilotoEquipeVelocidade = new Piloto();
		Piloto pilotoEquipeTrapaceiros = new Piloto();
		
		pilotoEquipeVelocidade.setNome("Piloto 1");
		pilotoEquipeVelocidade.setIdade(25);
		pilotoEquipeVelocidade.setHabilidade(75);
		
		pilotoEquipeTrapaceiros.setNome("Piloto 2");
		pilotoEquipeTrapaceiros.setIdade(27);
		pilotoEquipeTrapaceiros.setHabilidade(65);
		
		carroEquipeVelocidade.setPiloto(pilotoEquipeVelocidade);
		carroEquipeTrapaceiros.setPiloto(pilotoEquipeTrapaceiros);
		
		carroEquipeVelocidade.ligar();
		carroEquipeTrapaceiros.ligar();
		
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
		
		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();
	}

}
