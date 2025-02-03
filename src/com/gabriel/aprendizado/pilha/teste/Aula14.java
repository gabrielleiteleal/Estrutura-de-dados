package com.gabriel.aprendizado.pilha.teste;

import com.gabriel.aprendizado.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();

		for(int i = 1; i <= 10; i++) {
			pilha.empilha(i);
		}
		
		pilha.desempilha();
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
	}

}
