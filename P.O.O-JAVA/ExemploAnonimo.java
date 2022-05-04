package br.org.serratec.exemplos;

import javax.swing.JButton;

public class ExemploAnonimo {

	public static void main(String[] args) {

		JButton jButton = new JButton();
		jButton.addActionListener(e -> System.out.println("teste"));
		
	}

}
