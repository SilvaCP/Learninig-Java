/**
 * @author carlos
 * Operadores lógicos com if else.
 * */
package br.com.carlos.learningJavamodulo08;

public class Module08_Exercise01 {
	public static void main(String[] args) {

		// Example 1
//		double media = 70; 
//		String nome = "Carol";
//		if (media >= 70 && nome.equals("Carola")) {
//			System.out.println("Aprovado!");
//		} else if (media < 70) {
//			System.out.println("Reprovado!");
//		}else {
//			System.out.println("Não encontrado!");
//		}

		// Example 2

		double nota1 = 10;
		double nota2 = 60;
		double nota3 = 10;
		double nota4 = 10;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aprovado! " + media);
		}
		if (media >= 40 && media <= 69) {
			System.out.println("Recuperação! " + media);
		} else {
			System.out.println("Reprovado! " + media);
		}
	}

}
