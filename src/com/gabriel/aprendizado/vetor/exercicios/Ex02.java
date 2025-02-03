package com.gabriel.aprendizado.vetor.exercicios;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex02 {

	public static void main(String[] args) {
		
		//Melhore a classe Lista e implemente o método ultimoIndice, semelhante ao método lastIndexOf.
		Lista<String> lista = new Lista<String>(3);
		
		lista.adicionar("Elemento 1");
		lista.adicionar("Elemento 2");
		lista.adicionar("Elemento 3");
		lista.adicionar("Elemento 1");
		lista.adicionar("elemento 4");
		lista.adicionar("Elemento 1");
		
		System.out.println(lista);
		System.out.println(lista.ultimoIndice("Elemento 1"));
	}

}
