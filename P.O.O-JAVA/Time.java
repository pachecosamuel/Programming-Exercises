package br.org.serratec;

public class Time {

	private String nomeTime, tecnico;
	private Atleta[] atletas;

	public Time(String nomeTime, String tecnico, Atleta[] atleta) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.atletas = atleta;
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public Atleta[] getAtleta() {
		return atletas;
	}

	public void setAtleta(Atleta[] atleta) {
		this.atletas = atleta;
	}

	public void inserirAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}

	public void listarTime() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println("Nome do Atleta: " +
		    atletas[i].getNome());
		}
	}

}
