package com.gabriel.aprendizado.pilha.labs;

import javax.swing.colorchooser.DefaultColorSelectionModel;

import com.gabriel.aprendizado.pilha.Pilha;

public class Ex06 {

	public static void main(String[] args) {
		
		imprimeResultado("a+(b)");

	}
	
	final static String ABRE = "([{";
	final static String FECHA = ")]}";
	
	public static void imprimeResultado(String expressao){
		System.out.println(expressao + " está balenceada? " + verificaSimbolosBalanceados(expressao));
	}
	
	public static boolean verificaSimbolosBalanceados(String expressao) {

		Pilha<Character> pilha = new Pilha<Character>();
		int i = 0;
		char simbolo, topo;
		
		while(i<expressao.length()) {
			
			simbolo = expressao.charAt(i);
			
			if(ABRE.indexOf(simbolo) > -1) {
				pilha.empilha(simbolo);
				
			} else if(FECHA.indexOf(simbolo) > -1) {
				
				if(pilha.estaVazio()) {
					return false;
				}else {
					topo = pilha.desempilha();
					
					if(ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
					
				}
				
			}
			
			i++;
			
		}
		
		return true;
	}

}
