package interfacesPratica;

public class TesteTributos {

	public static void main(String[] args) {

		Pessoa pf = new Pessoa("Samuel", 342000);
		Empresa pj = new Empresa("TechTem", 1500000);
		TotalTributos tt = new TotalTributos();
		
		System.out.println("Total IR PF: " + pf.calculaIR());
		System.out.println("Total IR PJ: " + pj.calculaIR());
		System.out.println("Total ICMS PJ: " + pj.calculaIcms());
		
		System.out.println();
		
		tt.totalizarTributos(pf);
		System.out.println("Total de tributos Pessoa Fisica: " + tt.getTotal());
		
		tt.totalizarTributos(pj);
		System.out.println("Total de tributos Pessoa Jurídica: " + tt.getTotal());
		
		
		

	}

}
