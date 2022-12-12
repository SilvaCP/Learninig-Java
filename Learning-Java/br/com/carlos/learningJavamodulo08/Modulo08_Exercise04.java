/*
 * @Author Carlos
 * Comando Switch Case. Usado em operações exatas!
 * */
package br.com.carlos.learningJavamodulo08;

public class Modulo08_Exercise04 {
	public static void main(String[] args) {

		// No caso abaixo que envolve notas o switch case, não funciona.
//		int nota1 = 70;
//		int nota2 = 70;
//		int nota3 = 70;
//		int nota4 = 70;
//		int media = 0;
//		
//		media = (nota1 + nota2 + nota3 + nota4)/4;

		// Já no caso exatos de dias, o switch case, e recomendado!

		int dia = 2;

		switch (dia) {
		case 1:
			System.out.println("Domingo!");
			break;

		case 2:
			System.out.println("Segunda-feira!");
			break;

		default:
			System.out.println("Outro dia qualquer: " + dia);
			break;
		}
	}

}
