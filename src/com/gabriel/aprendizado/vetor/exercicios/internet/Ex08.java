package com.gabriel.aprendizado.vetor.exercicios.internet;

import com.gabriel.aprendizado.vetor.Lista;

public class Ex08 {

	public static void main(String[] args) {
		
		Lista<Integer> conjunto1 = new Lista<Integer>(30);
		Lista<Integer> conjunto2 = new Lista<Integer>(30);
		Lista<Integer> conjuntoI = new Lista<Integer>(60);
		int i=0;
		
		for(i=0; i<30; i++) {
			conjunto1.adicionar(i);
		}
		for(i=30; i<60; i++) {
			conjunto2.adicionar(i);
		}
		
		for(i=0; i<30; i++) {
			conjuntoI.adicionar(conjunto1.buscar(i));
			conjuntoI.adicionar(conjunto2.buscar(i));
		}
		
		System.out.println(conjunto1);
		System.out.println(conjunto2);
		System.out.println(conjuntoI);

	}

}
