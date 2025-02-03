package com.gabriel.aprendizado.vetor.teste;

import com.gabriel.aprendizado.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(5);
		
		vetor.adicionar("A");
		vetor.adicionar("B");
		vetor.adicionar("C");
		vetor.adicionar("D");
		vetor.adicionar("E");
		
		System.out.println(vetor);
		vetor.remover(1);
		System.out.println(vetor);
		
		//Remover o Elemento E
		
		int pos = vetor.buscarElemento("E");
		if(pos > -1) {
			vetor.remover(pos);
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		
		System.out.println(vetor);

	}

}
