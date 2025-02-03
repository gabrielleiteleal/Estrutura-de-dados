package com.gabriel.aprendizado.listaduplamenteencadeada.teste;

import com.gabriel.aprendizado.listaduplamenteencadeada.ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeadaTeste {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada<Integer> listaDupla = new ListaDuplamenteEncadeada<>();
		ListaDuplamenteEncadeada<Integer> listaDupla2 = new ListaDuplamenteEncadeada<>();
		@SuppressWarnings("unused")
		int[] vetor = { 1, 2, 3, 4, 5, 6 };

		for(int i=1; i<7; i++) {
			listaDupla.adicionarNoFinal(i);
			listaDupla2.adicionarNoFinal(i+6);
		}

		System.out.println("Lista: " + listaDupla);
		System.out.println("Outra: " + listaDupla2);
		System.out.print("Vetor: ");
		for (int e : vetor) {
			System.out.print(e + " ");
		}
		System.out.println("\n----------------------");
		System.out.println("A soma dos números impares é: " + listaDupla.somarImpares(listaDupla));
		System.out.println("----------------------");
		listaDupla.percorrerOrdemInversao(listaDupla);
		System.out.println("----------------------");
		System.out.println("Os elementos do vetor é igual aos da lista?");
		System.out.println(listaDupla.vetorIgual(vetor));
		System.out.println("----------------------");
		System.out.println("Mesclar listas");
		System.out.println(listaDupla.mesclarListas(listaDupla, listaDupla2));
		System.out.println("----------------------");
		final int A = 3;
		final int B = 1;
		System.out.println("Removendo elementos entre '" + A + "' e '" + B + "': ");
		listaDupla.removerEntre(A, B, listaDupla);
		System.out.println(listaDupla);
		

	}
}
