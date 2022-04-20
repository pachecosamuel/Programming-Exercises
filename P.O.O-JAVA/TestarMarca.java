package br.org.serratec.enumaradores;

public class TestarMarca {

	public static void main(String[] args) {

		MarcaCelular mc1 = new MarcaCelular(6, "S12", Marca.SAMSUNG);

		System.out.println(mc1);
		
		Marca[] marcas = Marca.values();
		
		for (int i = 0; i < marcas.length; i++) {
			System.out.println(marcas[i]);
		}
		
		for (Marca marca : marcas) {
			System.out.println(marca);
		}
		
	}

}
