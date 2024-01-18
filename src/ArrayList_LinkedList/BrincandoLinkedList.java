package ArrayList_LinkedList;

import java.util.LinkedList;

public class BrincandoLinkedList {

	public static void main(String[] args) {

		LinkedList<String> carros = new LinkedList<>();
		
		carros.add("Xc-60");
		carros.add("X6");
		carros.add("F-Type");
		carros.add("MAclaren 720S");
		carros.add("GT-R");
		
		//Adicionando no inicio
		carros.addFirst("Macan");
		
		//Adicionando no final
		carros.addLast("Velar");
		
		//Renmoveer o primeiro
		carros.removeFirst();
		
		
		
		
		
		System.out.println(carros);
		
		
	}

}
