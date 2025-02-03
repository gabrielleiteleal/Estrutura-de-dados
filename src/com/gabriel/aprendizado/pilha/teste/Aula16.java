package com.gabriel.aprendizado.pilha.teste;

import com.gabriel.aprendizado.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		
		Pilha<String> pilha = new Pilha<String>();
		
		System.out.println(pilha.espiarTopo());

		for(int i = 1; i <= 10; i++) {
			pilha.empilha("Elemento " + i);
		}
		
		pilha.desempilha();
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		System.out.println(pilha.espiarTopo());

	}

}
