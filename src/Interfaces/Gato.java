package Interfaces;

public class Gato implements Animal{

	@Override
	public void emitirSom() {
		
		System.out.println("MIAU");
		
	}

	@Override
	public void animalCorrer() {
		System.out.println("Correndo e pulando de talhado em telhado");
		
	}

	@Override
	public void animalComer() {
		
		System.out.println("COmendo ração");
		
	}

	@Override
	public void apresentacaoAnimal() {

		System.out.println("Olá eu sou um gato ");
	}

}
