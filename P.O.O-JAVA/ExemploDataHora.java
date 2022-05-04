package br.org.serratec.datahora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemploDataHora {

	public static void main(String[] args) {

		LocalTime hr = LocalTime.now();
		System.out.println(hr);
		System.out.println(LocalTime.of(22, 10));
		
		
		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);
		
	}

}
