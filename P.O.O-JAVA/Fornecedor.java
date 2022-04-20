package org.serratec.model;

public class Fornecedor {

		private String nomeSocial, telefone, cnpj;
		private static int contador;
		
		public Fornecedor(String nomeSocial, String telefone, String cnpj) {
			this.nomeSocial = nomeSocial;
			this.telefone = telefone;
			this.cnpj = cnpj;
			contador++;
		}
		
		public static int getContador() {
			return contador;
		}

		public String getNomeSocial() {
			return nomeSocial;
		}
		public void setNomeSocial(String nomeSocial) {
			this.nomeSocial = nomeSocial;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getCnpj() {
			return cnpj;
		}
		public void setCnpj(String cnpj) {
			this.cnpj = cnpj;
		}
		
		
	
}
