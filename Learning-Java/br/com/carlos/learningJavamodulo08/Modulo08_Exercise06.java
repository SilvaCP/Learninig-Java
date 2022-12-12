/**
 * @author carlos
 * Estrutura de repetição while - do while
 * */
package br.com.carlos.learningJavamodulo08;

public class Modulo08_Exercise06 {
	public static void main(String[] args) {

		int num = 0;

//		while (num <= 3) { // Verifica e depois executa!
//			System.out.println("Número: " + num);
//			num++; // Sem essa linha o código roda indefinidamente.
//		}

		do { // Primeiro executa e depois verifica.
			System.out.println("O número é: " + num);
			num++;
		} while (num <= 3);

	}

}
