package br.org.serratec.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class ExemploLocalDate {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		
		System.out.println(LocalDate.now());

		System.out.println(hoje.plusDays(10));
		System.out.println(hoje.minusYears(10));
		System.out.println(hoje.isLeapYear());
		
		Period periodo = Period.between(LocalDate.of(2022, 04, 25), 
				LocalDate.of(2022, 12, 31));
		
		
	}

}
