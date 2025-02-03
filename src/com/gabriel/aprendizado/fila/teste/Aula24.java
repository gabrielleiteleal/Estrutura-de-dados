package com.gabriel.aprendizado.fila.teste;

import com.gabriel.aprendizado.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<Paciente>();
		
		fila.enfileirarComPrioridade(new Paciente("A", 2));
		fila.enfileirarComPrioridade(new Paciente("B", 4));
		fila.enfileirarComPrioridade(new Paciente("C", 1));
		
		
		System.out.println(fila);
		System.out.println(fila.desenfileirar());
		System.out.println(fila);

	}

}
