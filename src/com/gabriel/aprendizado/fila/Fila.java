package com.gabriel.aprendizado.fila;

import com.gabriel.aprendizado.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	public Fila() {
		super();
	}

	public Fila(int capacidade) {
		super(capacidade);
	}

	public void enfileirar(T elemento) {
		this.adicionar(elemento);
	}
	
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

	public T desenfileirar() {

		if(!this.estaVazio()) {

			T primeiroElemento = this.elementos[0];

			for(int i=1; i<this.tamanho(); i++) {
				this.elementos[i-1] = this.elementos[i];
			}
			this.tamanho--;

			return primeiroElemento;

		}

		return null;

	}
	
	public T espiar() {
		
		if(!this.estaVazio()) {
			return this.elementos[0];
		}
		
		return null;
	}

}
