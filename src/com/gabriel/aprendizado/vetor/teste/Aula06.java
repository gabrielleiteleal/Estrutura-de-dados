package com.gabriel.aprendizado.vetor.teste;

import com.gabriel.aprendizado.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);


		vetor.adicionar("Elemento 1");
		vetor.adicionar("Elemento 2");
		vetor.adicionar("Elemento 3"); 
		
		System.out.println(vetor.buscarElemento("Elemento 6"));

	}

}
