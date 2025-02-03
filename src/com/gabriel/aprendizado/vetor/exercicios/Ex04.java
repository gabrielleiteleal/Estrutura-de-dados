package com.gabriel.aprendizado.vetor.exercicios;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex04 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(2);

		lista.adicionar("Elemento 1");
		lista.adicionar("Elemento 2");
		System.out.println(lista);
		System.out.println(lista.obtem(0));
		lista.limpar();
		System.out.println(lista);

	}

}
