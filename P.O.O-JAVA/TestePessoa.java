package br.org.serratec.enumaradores;

public class TestePessoa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Jão", "123@", Setor.RH, EstadoCivil.CASADO);

		System.out.println(p1.toString());
		System.out.println(p1.getSetor().getSala());
		System.out.println(p1.getSetor().ordinal());
		System.out.println(p1.getSetor().valueOf("Contabilidade"));
		
		for (EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil);
		}
	}

}
