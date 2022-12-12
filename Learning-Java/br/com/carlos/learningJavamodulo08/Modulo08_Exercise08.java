/**
 * @author carlos
 * Estrutura de repetição e parada com Break;
 * */
package br.com.carlos.learningJavamodulo08;

public class Modulo08_Exercise08 {
	public static void main(String[] args) {

		for (int num = 10; num >= 0; num--) {
			if (num == 8) {
				System.out.println("Obaaa! Encontrei o 8!");
				System.out.println("Estou parando de executar!");
				break;
			}
		}
	}

}
