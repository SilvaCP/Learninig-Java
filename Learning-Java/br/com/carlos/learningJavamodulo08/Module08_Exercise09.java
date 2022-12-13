/**
 * @author carlos
 * Estrutura de repetição e o continue.
 * */
package br.com.carlos.learningJavamodulo08;

public class Module08_Exercise09 {
	public static void main(String[] args) {
		for (int num = 0; num <= 10; num++) {
			if (num == 3 || num == 6 || num == 9) {
				System.out.println("Obaaa! Encontrei o número! " + num);
				continue;
			}
			System.out.println("Processando o laço de repetição!");
		}
	}

}
