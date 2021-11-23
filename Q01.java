package questaoum;

/* Faça um programa em Java que, a partir de um texto digitado pelo usuário, conte o número de caracteres
total e o número de palavras (palavra é definida por qualquer sequência de caracteres delimitada por espaços em
branco, não incluir os conectivos, artigos nem os, se, da, dos,) e exiba o resultado. */

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Insira seu texto: ");
		String texto = teclado.nextLine();
		String partes [] = texto.split(" ");
		// ["Teste","Helo","chaves"]v
		int contador =0;
		for (int i = 0; i < partes.length; i++) {
				
			if(partes[i].length()>3 ||partes[i].equalsIgnoreCase("Oi") || partes[i].equalsIgnoreCase("Vai") || partes[i].equalsIgnoreCase("ser") ) {
				contador++;
			}
		//	System.out.println(partes[i].length());
		}
		System.out.println("O número de caracteres é: ");
	System.out.println(texto.length());
	
	System.out.println("O número de palavras é: "+ contador);
	
	
	}

}


