package com.gabriel.aprendizado.vetor.teste;

import com.gabriel.aprendizado.vetor.VetorObjetos;

public class VetorTeste {

	public static void main(String[] args) throws Exception {

		VetorObjetos vetor = new VetorObjetos(10);
		
		for(int i=1;i<11;i++) {
			vetor.adicionar(i);	
		}
		
		vetor.adicionar(3, 4);
		
		
		System.out.println(vetor);
		vetor.removerDuplicatas();
		System.out.println(vetor);
		System.out.println(vetor.maiorElemento());
		
		

	}

}
