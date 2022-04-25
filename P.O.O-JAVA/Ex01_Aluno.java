package review.cap.nove;

public class Ex01_Aluno {

	private String nome;
	private double n1, n2;
	
	public Ex01_Aluno(String nome, double n1, double n2) {
		super();
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public String getNome() {
		return nome;
	}

	public double getN1() {
		return n1;
	}

	public double getN2() {
		return n2;
	}
	
	public double calcularMedia(double n1, double n2){
		if (n1 < 0 && n1 > 10 && n2 < 0 && n2 > 10) {
			return (n1+n2) / 2;
		} else {
		throw new Ex01_AlunoException("Nota maior do que dez ou menor do que zero");
		}
	}

	@Override
	public String toString() {
		return "Ex01_Aluno [nome=" + nome + ", n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
	
}
