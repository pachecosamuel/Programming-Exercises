package org.serratec.model;

import javax.swing.JOptionPane;

public class PanoPraManga {

	public static void main(String[] args) {
		
		String n1 = JOptionPane.showInputDialog("Entre com n1: ");
		String n2 = JOptionPane.showInputDialog("Entre com n2: ");
		
		Double nota1 = Double.parseDouble(n1);
		Double nota2 = Double.parseDouble(n2);
		
		JOptionPane.showMessageDialog(null, (nota1 + nota2) / 2);

	}

}
