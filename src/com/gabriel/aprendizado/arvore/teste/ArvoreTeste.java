package com.gabriel.aprendizado.arvore.teste;

import com.gabriel.aprendizado.arvore.Arvore;

public class ArvoreTeste {

	public static void main(String[] args) {
		
		Arvore<Integer> arvore = new Arvore<Integer>();
		
		arvore.adicionar(10);
		
		System.out.println(arvore);

	}

}
