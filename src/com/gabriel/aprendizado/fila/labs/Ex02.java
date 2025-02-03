package com.gabriel.aprendizado.fila.labs;

import com.gabriel.aprendizado.fila.Fila;

public class Ex02 {

	public static void main(String[] args) {
		
		Fila<String> normal = new Fila<String>();
		Fila<String> prioridade = new Fila<String>();
		
		final int MAX_COUNT = 3;
		
		normal.enfileirar("normal 1");
		normal.enfileirar("normal 2");
		normal.enfileirar("normal 3");
		prioridade.enfileirar("prioridade 1");
		prioridade.enfileirar("prioridade 2");
		prioridade.enfileirar("prioridade 3");
		prioridade.enfileirar("prioridade 4");
		prioridade.enfileirar("prioridade 5");
		normal.enfileirar("normal 4");
		normal.enfileirar("normal 5");
		normal.enfileirar("normal 6");
		normal.enfileirar("normal 7");
		normal.enfileirar("normal 8");

		while(!normal.estaVazio() || !prioridade.estaVazio()) {
			
			int i=0;
			
			while(!prioridade.estaVazio() && i<MAX_COUNT) {
				atenderPessoa(prioridade);
				i++;
			} 
			
			if (!normal.estaVazio()){
				atenderPessoa(normal);
			}
			
			if(prioridade.estaVazio()) {
				while(!normal.estaVazio()) {
					atenderPessoa(normal);
				}
			}
			
		}

	}
	
	public static void atenderPessoa(Fila<String> fila) {
		String nome = fila.desenfileirar(); 
		System.out.println(nome);
	}

}
