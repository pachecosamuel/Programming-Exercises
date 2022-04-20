package br.org.serratec;

public class TotalTributos {

	private double total;
	
	public void totalizarTributos(Tributos tributos) {
		
		total += tributos.calcularICMS();
		total += tributos.calculaIR();
		
		/*System.out.println(tributos.toString() + "\n" +
		"ICMS: " + tributos.calcularICMS());
		
		System.out.println(tributos.toString() + "\n" +
				"ICMS: " + tributos.calculaIR());*/
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
}
