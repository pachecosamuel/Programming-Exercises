package review.cap.nove;

public enum Categoria {

	ELETRONICO(1), 	ALIMENTO(2), AUTOMOTIVO(3),
	ROUPAS(4), FARMACEUTICO(5);
	
	private int posicao;

	private Categoria(int posicao) {
		this.posicao = posicao;
	}
	
}
