package br.org.serratec;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Diretor("Samuel", 32000, "T.I");
		Funcionario f2 = new Gerente("André", 19000, "Marketing");
		Funcionario f3 = new Assistente("João", 7000, "Adm");
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}

}
