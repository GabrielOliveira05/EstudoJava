package Interfaces;

public class Main {

	public static void main(String[] args) {

		Gado gado = new Gado();
		
		gado.apresentacaoAnimal();
		gado.emitirSom();
		gado.animalCorrer();
		gado.animalComer();
		
		System.out.println("=========================================");
		Gato gato = new Gato();
		gato.apresentacaoAnimal();
		gato.emitirSom();
		gato.animalCorrer();
		gato.animalComer();
		
		
		
	}

}
