package br.org.serratec;

public class TesteSorteio {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Samuel", "Diretor T.I", "Tech");
		Funcionario f2 = new Funcionario("Joana", "Dev-ops", "Tech");
		Funcionario f3 = new Funcionario("Manuela", "Assistente de produção", "Mkt");
		Funcionario f4 = new Funcionario("Sofia", "Tech Recruiter", "RH");
		
		Sorteio<Funcionario> sorteio = new Sorteio<>();
		
		sorteio.adicionar(f1);
		sorteio.adicionar(f2);
		sorteio.adicionar(f3);
		sorteio.adicionar(f4);
		
		Funcionario funcionario = sorteio.sortear();
		System.out.println(funcionario);
		
		Sorteio<Integer> sortearNumeros = new Sorteio<>();
		sortearNumeros.adicionar(100);
		sortearNumeros.adicionar(200);
		sortearNumeros.adicionar(300);
		sortearNumeros.adicionar(400);
		Integer i = sortearNumeros.sortear();
		System.out.println(i);
		
	}

}
