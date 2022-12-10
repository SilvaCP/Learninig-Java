/*
 * @Author Carlos
 * Operadores ternários.
 * */
package br.com.carlos.learningJavamodulo08;

public class Module08_Exercise02 {
	public static void main(String[] args) {
		/* Operadores ternários Simples */
		/* Operadores ternários são para microvalidações! */
		/* Usado em uma linha só! */
		double nota1 = 40;
		double nota2 = 40;
		double nota3 = 80;
		double nota4 = 90;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// String resultado = media >= 70 ? "Aprovado!" : "Reprovado!";
		String resultado = media >= 70 ? "Aprovado!" : (media >= 40 && media <= 69) ? "Recuperação" : "Reprovado!";
		System.out.println(resultado);
	}

}
