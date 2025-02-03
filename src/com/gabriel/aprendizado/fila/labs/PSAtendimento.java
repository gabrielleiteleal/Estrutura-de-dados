package com.gabriel.aprendizado.fila.labs;

import com.gabriel.aprendizado.fila.FilaComPrioridade;

public class PSAtendimento implements Runnable {
	
	private FilaComPrioridade<Pessoa> fila;
	
	public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
		super();
		this.fila = fila;
	}

	@Override
	public void run() {
		
		while(!fila.estaVazio()) {
			
			try {
				System.out.println(fila.desenfileirar() + " atendida.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Atendimento concluído!");
		
	}

}
