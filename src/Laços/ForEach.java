package Laços;

public class ForEach {

	public static void main(String[] args) {

		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Varrendo o vetor sem o For Each");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Numero: " + vetorNumeros[i]);
		}
		
		System.out.println("================================");
		
		System.out.println("Varrendo o vetor com o For Each");
		for (int listaNumeros : vetorNumeros) {
			System.out.println("Número: " + listaNumeros);
		}
		
	}

}
