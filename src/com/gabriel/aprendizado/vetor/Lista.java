package com.gabriel.aprendizado.vetor;

import java.lang.reflect.Array;

@SuppressWarnings("unused")
public class Lista<T> {

	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adicionar(T elemento) {
		
		aumentarCapacidade();
		
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
		
	}
	
	public boolean adicionar(int posicao, T elemento) {
		
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		aumentarCapacidade();
		
		for(int i = this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return false;
	}
	
	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length*2];
			for(int i = 0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public T buscar(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException ("Posição inválida");
		}
		return this.elementos[posicao];
	}
	
	public int buscarElemento(T elemento) {
		
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public T obtem(int posicao) {
		
		return this.buscar(posicao);
		
	}
	
	public boolean contain(T elemento) {

		return buscarElemento(elemento) > -1;
	}
	
	public void remover(int posicao) {

		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for(int i = posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}
	
	public void remover(T elemento) {
		
		int pos = this.buscarElemento(elemento);
		
		if(pos > -1) {
			this.remover(pos);
		}
		
	}
	
	public void limpar() {
		
		//Opção 1
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//Opção 2
		//this.tamanho = 0;
		
		//Opção 3
		for(int i = 0; i<this.tamanho; i++){
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public int ultimoIndice(T elemento) {

		for(int i = this.tamanho-1; i >= 0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}

		return -1;
	}
	
	public boolean estaVazio() {
		return tamanho==0 ? true : false;
	}
	

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		
		return s.toString();
	}
	
}
