package br.org.serratec.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo01Data {

	public static void main(String[] args) {

		Date dataDeHoje = new Date();
		System.out.println(dataDeHoje);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataComFormato = sdf.format(dataDeHoje);
		System.out.println(dataComFormato);
		
	}

}
