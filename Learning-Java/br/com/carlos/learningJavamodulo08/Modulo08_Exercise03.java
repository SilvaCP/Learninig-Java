/*
 * @Author Carlos
 * Operações lógicas aninhadas.
 * */
package br.com.carlos.learningJavamodulo08;

public class Modulo08_Exercise03 {
	public static void main(String[] args) {
		double nota1 = 90;
		double nota2 = 90;
		double nota3 = 90;
		double nota4 = 50;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aprovado direto! - Parabéns! " + media);
				} else {
					System.out.println("Aprovado! " + media);
				}
			} else {
				System.out.println("Recuperação! " + media);
			}
		} else {
			System.out.println("Reprovado direto! " + media);
		}
	}
}
