package com.gabriel.aprendizado.vetor.exercicios;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex01 {

	public static void main(String[] args) {
		
		//Melhorar a classe Lista e implementar o método contém, semelhante ao contains da classe ArrayList.
		Lista<Integer> lista = new Lista<Integer>(3);
		
		lista.adicionar(1);
		lista.adicionar(4);
		lista.adicionar(6);
		System.out.println(lista);
		
		System.out.println(lista.contain(2));

	}

}
