package com.gabriel.aprendizado.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		
		Queue<Paciente> filaComPrioridade = new PriorityQueue<Paciente>();
		
		filaComPrioridade.add(new Paciente("A", 3));
		filaComPrioridade.add(new Paciente("B", 1));
		
		System.out.println(filaComPrioridade);
		System.out.println(filaComPrioridade.poll());
		System.out.println(filaComPrioridade);

	}

}
