package br.org.serratec;

public class NewTeam {

	private String nomeTime, tecnico;
	private NewAtleta[] atletas;
	
	public NewTeam(String nomeTime, String tecnico, NewAtleta[] atletas) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.atletas = atletas;
	}
	public NewAtleta[] getAtletas() {
		return atletas;
	}
	public void setAtletas(NewAtleta[] atletas) {
		this.atletas = atletas;
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public String getTecnico() {
		return tecnico;
	}
	
	public void adicionarAtletas(NewAtleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				return;
			}
		}
	}
	
	public void mostrarTime() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println(atletas[i].getNome());
		}
	}
	
}
