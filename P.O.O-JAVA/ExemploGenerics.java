package br.org.serratec;

import java.math.BigDecimal;

public class ExemploGenerics {

	public static void main(String[] args) {

		/*MyGenerics<Integer> myg1 = new MyGenerics<Integer>(100);
		MyGenerics<String> myg2 = new MyGenerics("Olá, mundO!");
		System.out.println(myg1);
		System.out.println(myg2);*/
		
		MyGenerics<? super Number> myg = new MyGenerics(1000);
		myg.setValor(new Integer(1100));
		myg.setValor(50.5);
		myg.setValor(new BigDecimal(1000000));
		
		System.out.println(myg);
		
		
	}

}
