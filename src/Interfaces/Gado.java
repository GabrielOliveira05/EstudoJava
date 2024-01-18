package Interfaces;

public class Gado implements Animal {

	@Override
	public void emitirSom() {

		System.out.println("Muuu");

	}

	@Override
	public void animalCorrer() {
		System.out.println("Correndo a 40km/h");
	}

	@Override
	public void animalComer() {
		System.out.println("Comendo 3 kg de mato");
	}

	@Override
	public void apresentacaoAnimal() {
		System.out.println("Olá eu sou o gado");
	}

}
