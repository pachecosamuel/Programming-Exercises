package reviewCap10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDatezada {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatadorBarra);
		
		
		
		/*ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);
		
		Set<String> fusos = ZoneId.getAvailableZoneIds();
		for (Object f : fusos) {
			System.out.println(f);
		}
		
		
		LocalTime hora = LocalTime.now();
		System.out.println(hora);
		
		System.out.println(LocalTime.of(20, 10));
		System.out.println(LocalTime.parse("11:55"));
		
		LocalDate ld = LocalDate.now();
		Period p = Period.between(LocalDate.of(1997, 10, 14), LocalDate.now());
		
		System.out.println("Dia de hoje: " + ld.getDayOfMonth());
		System.out.println("Dia da semana: " + ld.getDayOfWeek());
		System.out.println("Mês: " + ld.getMonth());
		System.out.println("Ano atual: " + ld.getYear());
		System.out.println("Qts dias se passaram desde o início do ano: " +
		ld.getDayOfYear());
		System.out.println("Quanto tempo se passou desde seu nascimento: " +
		"Anos: " + p.getYears() + ", Meses: " + p.getMonths() + ", Dias: " + p.getDays());
		
		
		LocalDate hj = LocalDate.now();
		//System.out.println(hj);
		
		//Mostra 30 dias a frente
		//System.out.println(hj.plusDays(30));
		
		//Mostra x dias atrás
		//System.out.println(hj.minusDays(15));
		
		//Dois meses atrás
		//System.out.println(hj.minus(2, ChronoUnit.MONTHS));
		
		//System.out.println(hj.getDayOfWeek() + " " + hj.getDayOfMonth() +
		//		" " + hj.getDayOfYear());
				
		//System.out.println(hj.isLeapYear());	
				
		LocalDate a = LocalDate.of(2022, 04, 26);
		LocalDate b = LocalDate.of(2021, 04, 26);
		
		System.out.println(b.isEqual(a));*/
				
				
				
				
				
	}

}
