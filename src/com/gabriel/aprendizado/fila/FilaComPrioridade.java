package com.gabriel.aprendizado.fila;

public class FilaComPrioridade<T> extends Fila<T> {

	public void enfileirarComPrioridade(T elemento) {

		Comparable<T> chave = (Comparable<T>) elemento;

		int i;
		for(i=0; i<this.tamanho; i++) {
			if(chave.compareTo(this.elementos[i]) < 0) {
				break;	
			}
		}
		
		this.adicionar(i, elemento);

	}

}
