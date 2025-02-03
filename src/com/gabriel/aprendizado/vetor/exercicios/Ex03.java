package com.gabriel.aprendizado.vetor.exercicios;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex03 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(2);
		
		lista.adicionar("A");
		lista.adicionar("B");
		lista.adicionar("C");
		lista.adicionar("D");
		
		lista.remover("B");
		
		System.out.println(lista);

	}

}
