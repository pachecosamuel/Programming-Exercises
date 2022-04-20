package interfacesPratica;

public class Empresa implements Tributos {

	private String nomeSocial;
	private double rendimentos;
	
	public Empresa(String nomeSocial, double rendimentos) {
		super();
		this.nomeSocial = nomeSocial;
		this.rendimentos = rendimentos;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	@Override
	public double calculaIR() {
		return this.rendimentos * irpj;
	}

	@Override
	public double calculaIcms() {
		return this.rendimentos * icms;
	}

	@Override
	public String toString() {
		return "Empresa [nomeSocial=" + nomeSocial + ", rendimentos=" + rendimentos + "]";
	}

	
	
}
