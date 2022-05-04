package br.org.serratec.datas;

import java.util.Calendar;

public class Exemplo02Calendar {

	public static void main(String[] args) {

		Calendar dataDeHoje = Calendar.getInstance();
		//System.out.println(dataDeHoje);
		int ano = dataDeHoje.get(Calendar.YEAR);
		int mes = dataDeHoje.get(Calendar.MONTH);
		int dia = dataDeHoje.get(Calendar.DAY_OF_MONTH);
		int hora = dataDeHoje.get(Calendar.HOUR);

		System.out.println("Ano " + ano + " Mês " + mes + " Dia " + dia  + " Hora: " + hora);
		
	}

}
