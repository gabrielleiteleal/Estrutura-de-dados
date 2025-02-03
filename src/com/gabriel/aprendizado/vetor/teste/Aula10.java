package com.gabriel.aprendizado.vetor.teste;

import com.gabriel.aprendizado.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Aula10Contato c1 = new Aula10Contato("Gabriel", "123", "asdasd");
		Aula10Contato c2 = new Aula10Contato("Sla", "333", "bbbbb");
		Aula10Contato c3 = new Aula10Contato("Asd", "222", "aaaaa");
		
		/*vetor.adicionar(3);
		vetor.adicionar("Elemento 1");
		vetor.adicionar(true);*/
		
		vetor.adicionar(c1);
		vetor.adicionar(c2);
		vetor.adicionar(c3);
		
		int pos = vetor.buscarElemento(c2);
		
		System.out.println("Tamanho: " + vetor.tamanho());
		System.out.println(vetor);
		System.out.println(pos);
		
		

	}

}
