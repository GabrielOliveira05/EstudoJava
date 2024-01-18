package ArrayList_LinkedList;

import java.util.ArrayList;

public class BrincandoArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> carros = new ArrayList<>();
		
		carros.add("Civic");
		carros.add("Corolla");
		carros.add("Fit");
		carros.add("HR-V");
		carros.add("Fox");
		carros.add("Up");
		carros.add("Onix");
		
		//Substituir 
		carros.set(5, "320i");
		
		//Remover
		carros.remove("HR-V");
		
		//Esvaziar a ArrayList inteira
		//carros.clear();
		
		//Verificar se o Array está vazio
		if(carros.isEmpty()) {
			System.out.println("O vetor esrá vazio");
		}else {
			System.out.println("O vetor tem " + carros.size() + " posições");
		}
		
		
		//Alterar conteúdo de uma posição do Array
		if(carros.contains("Fox")) {
			for (int i = 0; i < carros.size(); i++) {
				if("Fox".equals(carros.get(i))) {
					carros.set(i, "Ferrari Itália");
					break;
				}
			}
		}
		
		//Mostra o Array
		 System.out.println(carros);

		
	}

}
