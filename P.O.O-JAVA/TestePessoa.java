package br.org.serratec;

public class TestePessoa {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("Rua A, 123", "Samuel", 19000, "100123");
		PessoaJuridica pj= new PessoaJuridica("Rua B, 456", "Bebeto", 50000, "456", "Bet 365");
		TotalTributos tt = new TotalTributos();

		System.out.println("Total IR PF: " + pf.calculaIR());
		System.out.println("Total IR PJ: " + pj.calculaIR());
		System.out.println("Total ICMS PJ: " + pj.calcularICMS());
		
		tt.totalizarTributos(pf);
		tt.totalizarTributos(pj);
		
		System.out.println("Total geral: " + tt.getTotal());
		

	}

}
