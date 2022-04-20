package br.org.serratec;

public class TestePlano {

	public static void main(String[] args) {

		Clinica c1 = new Clinica("Sul América" , "CheckUp", "1234");
		Medico m1 = new Medico("Golden Cross", "5467", "Samuel");
		Anestesista a1 = new Anestesista("Amil", "4567", "André", "Geral");
		ControlePagamento cp = new ControlePagamento();
		
		System.out.println(c1.calcularPagamento());
		System.out.println(m1.calcularPagamento());
		System.out.println(a1.calcularPagamento());
		
		//cp.calcularTotalPago(a1);
		//cp.calcularTotalPago(m1);
		//cp.calcularTotalPago(c1);
		
		//System.out.println("O valor total total é: " + String.format("%.2f" , cp.getTotalPago()));
		System.out.println(c1);
		System.out.println(m1);
		System.out.println(a1);
		
	}

}
