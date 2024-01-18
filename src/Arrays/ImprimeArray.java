package Arrays;

public class ImprimeArray {

	public static void main(String[] args) {

		String [] paises = new String[7];
		
		paises[0] = "Brasil";
		paises[1] = "Alemanha";
		paises[2] = "Espanha";
		paises[3] = "Noruega";
		paises[4] = "Equador";
		paises[5] = "Mexico";
		paises[6] = "Austria";
		
		for (String lista : paises) {
			System.out.println("País : " + lista);
		}
		
		
		
	}

}
