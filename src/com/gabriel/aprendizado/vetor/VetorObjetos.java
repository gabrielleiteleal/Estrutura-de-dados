package com.gabriel.aprendizado.vetor;

@SuppressWarnings("unchecked")
public class VetorObjetos<T> {

	private T[] elementos;
	private int tamanho;

	public VetorObjetos(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public boolean adicionar(Object elemento) {
		aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = (T) elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adicionar(int posicao, Object elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		aumentarCapacidade();
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = (T) elemento;
		this.tamanho++;
		return false;
	}

	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = (T[]) elementosNovos;
		}
	}

	public Object buscar(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.elementos[posicao];
	}

	public int buscarElemento(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public int maiorElemento() throws Exception {
		if (this.tamanho == 0) {
			throw new IllegalAccessException("O vetor está vazio");
		}
		int maior = (int) this.elementos[0];
		for (int i = 0; i < this.tamanho - 1; i++) {
			if ((int) elementos[i + 1] > (int) elementos[i]) {
				maior = (int) elementos[i + 1];
			}
		}
		return maior;
	}

	public void removerDuplicatas() {
		for (int i = 0; i < this.tamanho - 1; i++) {
			for (int j = i + 1; j < this.tamanho; j++) {
				if (elementos[i] == elementos[j]) {
					this.remover(j);
				}
			}
		}
	}

	public void rotacionarVetor(int pos) {
		if (pos < 0 || pos > this.tamanho) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = 0; i < pos; i++) {
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}
		s.append("]");
		return s.toString();
	}
}
