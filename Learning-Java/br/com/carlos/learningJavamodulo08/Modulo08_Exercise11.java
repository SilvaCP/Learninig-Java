/**
 * @author carlos
 * Criando entrada de dados.
 * */
package br.com.carlos.learningJavamodulo08;

import javax.swing.JOptionPane;

public class Modulo08_Exercise11 {
	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a Qtd de carros:");
		String pessoas = JOptionPane.showInputDialog("Informe a Qtd de pessoas:");

		double carroNumero = Double.parseDouble(carros);
		double pessoasNumero = Double.parseDouble(pessoas);

		int divisao = (int) (carroNumero / pessoasNumero);

		double resto = carroNumero % pessoasNumero;

		JOptionPane.showMessageDialog(null,
				"Para cada pessoa, foram destribuidos " + divisao + " carros e sobrou " + resto);
	}

}
