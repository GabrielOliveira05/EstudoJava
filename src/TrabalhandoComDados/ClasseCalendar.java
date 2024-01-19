package TrabalhandoComDados;

import java.util.Calendar;

public class ClasseCalendar {

	public static void main(String[] args) {

		System.out.println("==> Recuperação da data com a classe Calendar");
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Data e hota atual: " + cal.getTime() + "\n");
		System.out.println("Ano: " + cal.get(Calendar.YEAR));
		System.out.println("Dia do Mês: " + cal.get(Calendar.DAY_OF_MONTH) + "\n");
		
		System.out.println("==> Alterando a data/hora com método set");
		cal.set(Calendar.YEAR, 2023);
		cal.set(Calendar.DAY_OF_MONTH, 12);

		System.out.println("Data/Hora atual: " + cal.getTime());
		
		
		
	}

}
