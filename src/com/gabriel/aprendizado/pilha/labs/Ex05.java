package com.gabriel.aprendizado.pilha.labs;

import java.util.Scanner;

import com.gabriel.aprendizado.pilha.Pilha;

public class Ex05 {

	public static void main(String[] args) {

		

		//testarPalindromoLetra();
		
		System.out.println(testarPalindromoPalavra());

	}
	
	public static void testarPalindromoLetra() {
		
		Scanner scan = new Scanner(System.in);
		Pilha<String> pilha1 = new Pilha<String>();
		Pilha<String> pilha2 = new Pilha<String>();
		Pilha<String> pilhaInversa = new Pilha<String>();
		
		String letra;

		for(int i=0; i<3; i++) {
			System.out.println("Entre com uma letra: ");
			letra = scan.nextLine();
			pilha1.empilha(letra);
		}

		for(int i=0; i<3; i++) {
			System.out.println("Entre com uma letra: ");
			letra = scan.nextLine();
			pilha2.empilha(letra);
		}

		System.out.println("");

		System.out.println(pilha1 + "pilha 1");
		System.out.println(pilha2 + "pilha 2");


		for(int i = 0; i<pilha1.tamanho()+pilha2.tamanho(); i++) {

			pilhaInversa.empilha(pilha2.desempilha());

		}

		System.out.println(pilhaInversa + "pilha inversa");
		System.out.println("");

		for(int i = 0; i<=pilha1.tamanho()+pilhaInversa.tamanho(); i++) {

			if(!(pilha1.espiarTopo().equals(pilhaInversa.espiarTopo()))) {

				System.out.println("Valores diferentes!!");
				System.out.println(pilha1);
				System.out.println(pilhaInversa);
				System.out.println(pilha1.desempilha());
				System.out.println(pilhaInversa.desempilha());
				break;

			}else {

				System.out.println(pilha1);
				System.out.println(pilhaInversa);
				System.out.println("Pares iguais!!");
				System.out.println(pilha1.desempilha());
				System.out.println(pilhaInversa.desempilha());

			}

		}
		
	}
	
	public static boolean testarPalindromoPalavra() {
		
		Scanner scan = new Scanner(System.in);
		Pilha<Character> pilha = new Pilha<Character>();

		System.out.println("Entre com a palavra: ");
		String palavra = scan.nextLine();
		
		for(int i=0; i<palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}
		
		String palavraInversa = "";
		
		while(!pilha.estaVazio()) {
			palavraInversa += pilha.desempilha();
		}
		
		if(palavraInversa.equalsIgnoreCase(palavra)) {
			System.out.print("A palavra: " + palavra + " é palíndromo? ");
			return true;
		}
		
		System.out.print("A palavra: " + palavra + " é palíndromo? ");
		return false;
	}

}
