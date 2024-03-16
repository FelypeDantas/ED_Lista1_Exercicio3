package view;

import javax.swing.JOptionPane;

import controller.Fatorial;

public class Principal {

	public static void main(String[] args) {
		Fatorial fat = new Fatorial();
		int valor;
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
		
		while(valor >= 12 || valor < 1 ) {
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe outro valor, acima de 12 não é permitido"));
		}
		
		System.out.println(fat.ffat(valor));
	}
}
