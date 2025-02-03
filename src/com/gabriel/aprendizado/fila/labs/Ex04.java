package com.gabriel.aprendizado.fila.labs;

import java.util.Random;

import com.gabriel.aprendizado.fila.Fila;

public class Ex04 {

	public static void main(String[] args) {
		
		  Fila<Integer> fila = new Fila<Integer>();
		  
		  for(int i=0; i<10; i++) {
			  fila.enfileirar(i);
		  }
		  
		  System.out.println(fila);
		  
		  Random random = new Random();
		  int num =0;
		  while(num == 0) {
			  num = random.nextInt(10);
		  }
		  
		  while(fila.tamanho() > 1) {
			  for(int i=0; i<num; i++) {
				  fila.enfileirar(fila.desenfileirar());
			  }
			  System.out.println("Eliminado = " + fila.desenfileirar());
			  System.out.println(fila);
		  }
		  
		  System.out.println("Ganhador: " + fila.desenfileirar());

	}

}
