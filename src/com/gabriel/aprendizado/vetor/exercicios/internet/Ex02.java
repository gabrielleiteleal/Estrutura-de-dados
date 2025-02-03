package com.gabriel.aprendizado.vetor.exercicios.internet;

import com.gabriel.aprendizado.fila.Fila;
import com.gabriel.aprendizado.vetor.Lista;

public class Ex02 {

	public static void main(String[] args) {
		
		Lista<Integer> lista = new Lista<Integer>(50);
		Lista<Integer> listaInversa = new Lista<Integer>(50);
		
		
		for(int i=0; i<50; i++) {
			lista.adicionar(i);
		}
		
		System.out.println("Lista normal");
		System.out.println(lista);
		
		for(int i=lista.tamanho()-1; i>=0; i--) {
			listaInversa.adicionar(lista.buscar(i));
		}
		
		System.out.println("");
		System.out.println("Lista na ordem contrária");
		System.out.println(listaInversa);

	}

}
