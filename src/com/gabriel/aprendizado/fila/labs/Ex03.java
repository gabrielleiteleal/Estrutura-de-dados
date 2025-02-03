package com.gabriel.aprendizado.fila.labs;

import com.gabriel.aprendizado.fila.FilaComPrioridade;

public class Ex03 {
	
	public static final int VERDE = 2;
	public static final int AMARELO = 1;
	public static final int VERMELHO = 0;

	public static void main(String[] args) {

		FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<Pessoa>();
		
		fila.enfileirarComPrioridade(new Pessoa("1", VERDE));
		fila.enfileirarComPrioridade(new Pessoa("2", AMARELO));
		fila.enfileirarComPrioridade(new Pessoa("3", VERMELHO));
		fila.enfileirarComPrioridade(new Pessoa("4", VERDE));
		fila.enfileirarComPrioridade(new Pessoa("5", VERDE));
		fila.enfileirarComPrioridade(new Pessoa("6", VERMELHO));
		
		PSAtendimento atendimento = new PSAtendimento(fila);
		PSNovosPacientes pacientes = new PSNovosPacientes(fila);
		
		Thread t1 = new Thread(atendimento);
		Thread t2 = new Thread(pacientes);
		
		t1.start();
		t2.start();

	}

}
