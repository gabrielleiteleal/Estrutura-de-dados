package com.gabriel.aprendizado.lista.teste;

import com.gabriel.aprendizado.lista.ListaEncadeada;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {

		ListaEncadeada<Integer> lista = new ListaEncadeada<>();

		lista.adicionaNoInicio(1);
		lista.adicionaNoInicio(10);
		lista.adicionaNoFinal(80);
		lista.adicionaNoFinal(803);
		lista.adicionarQualquerPos(0, 37);

		System.out.println("Lista: "+lista);
		System.out.println("-----------------------");
		System.out.println("K-ésimo elemento: "+lista.encontrarKaesimo(2, lista));
		System.out.println("-----------------------");
		System.out.println("A lista possui '" + lista.quantidadeDeNos() + "' nós!");
		System.out.println("-----------------------");
		System.out.println("Lista invertida: " + lista.inverterLista());

	}
}
