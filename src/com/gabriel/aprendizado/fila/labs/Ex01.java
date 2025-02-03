package com.gabriel.aprendizado.fila.labs;

import com.gabriel.aprendizado.fila.Fila;

public class Ex01 {

	public static void main(String[] args) {
		
		imprimirDocumetos();
		

	}
	
	public static void imprimirDocumetos() {
		
		Fila<Documentos> fila = new Fila<Documentos>();
		Documentos a;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Enfileirando o " + i + "º documento...");
			fila.enfileirar(a = new Documentos("Documento "+i, 1+i));
			System.out.println(a);
			System.out.println("");
		}
		
		for(int i=1; i<=5; i++) {
			Documentos doc = fila.desenfileirar();
			System.out.println("Imprimindo " + doc.getNome());
			System.out.println("");
			try {
				Thread.sleep(200 * doc.getQtdFolhas());
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
