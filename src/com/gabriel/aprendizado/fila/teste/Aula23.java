package com.gabriel.aprendizado.fila.teste;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<Integer>();
		
		fila.add(1);
		fila.add(2);
		fila.add(3);
		
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll());
		System.out.println(fila);
		System.out.println(fila.poll());
	}

}
