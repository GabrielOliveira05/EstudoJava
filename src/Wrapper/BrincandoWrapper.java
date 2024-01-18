package Wrapper;

public class BrincandoWrapper {

	public static void main(String[] args) {

		Boolean bolWrapped = true;
		System.out.println(bolWrapped.getClass());
		
		Character chWrapped = 'a';
		System.out.println(chWrapped.getClass());
		
		Byte byteWrapped = 1;
		System.out.println(byteWrapped.getClass());
		
		
		int numero = Integer.parseInt("1");
		
		numero = numero + 1;
		
		System.out.println(numero);

		

	}

}
