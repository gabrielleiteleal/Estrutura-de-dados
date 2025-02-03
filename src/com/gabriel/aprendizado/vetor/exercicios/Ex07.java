package com.gabriel.aprendizado.vetor.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import com.gabriel.aprendizado.vetor.Lista;
import com.gabriel.aprendizado.vetor.teste.Aula10Contato;

public class Ex07 extends Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList<Aula10Contato> lista = new ArrayList<Aula10Contato>(20);

		criarContatosDinamicamente(5, lista);
		//System.out.println(lista);

		int opcao = 1;

		while(opcao != 0) {
			//opcao = obterOpcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarContatoFinal(scan, lista);
				break;
			case 2:
				adicionarContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;
			case 5:
				consultaUltimoIndice(scan, lista);
				break;
			case 6:
				consultaContatoExiste(scan, lista);
				break;
			case 7:
				excluirContatoPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				tamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;


			default:
				break;
			}

		}

		System.out.println("Programa finalizado!");


	}

	private static void imprimirVetor(ArrayList<Aula10Contato> lista) {


		System.out.println(lista);


	}

	private static void limparVetor(ArrayList<Aula10Contato> lista) {

		try {

			lista.clear();
			System.out.println("A lista foi limpada com sucesso!");

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void tamanhoVetor(ArrayList<Aula10Contato> lista) {

		try {

			System.out.println("O tamanho do vetor é: " + lista.size());

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void excluirContatoPosicao(Scanner scan, ArrayList<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Excluir contato de qual posição: ", scan);

		try {

			lista.remove(pos);

			System.out.println("Contato excluído com sucesso!");

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void excluirContato(Scanner scan, ArrayList<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Excluir contato de qual posição: ", scan);

		try {

			Aula10Contato contato = lista.get(pos);

			lista.remove(contato);

			System.out.println("Contato excluído com sucesso!");

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void consultaContatoExiste(Scanner scan, ArrayList<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.get(pos); 



			boolean contain = lista.contains(contato);

			if(contain) {
				pos = lista.indexOf(contato);
				System.out.println("O contato existe na lista, na posição " + pos);
				System.out.println("Contato existente, seguem dados: ");
				System.out.println(contato);
			}

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void consultaUltimoIndice(Scanner scan, ArrayList<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.get(pos); 

			System.out.println("Contato existente, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void obtemContatoPosicao(Scanner scan, ArrayList<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.get(pos); 

			System.out.println("Contato existente, seguem dados: ");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida");
		}



	}

	private static void obtemContato(Scanner scan, ArrayList<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.get(pos); 

			System.out.println("Contato existente, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição " + pos);

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}



	}

	private static void adicionarContatoFinal(Scanner scan, ArrayList<Aula10Contato> lista) {

		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Entre com o nome: ", scan);
		String telefone = lerInformacao("Entre com telefone: ", scan);
		String email = lerInformacao("Entre com e-mail: ", scan);

		Aula10Contato contato = new Aula10Contato(nome, telefone, email);

		lista.add(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);

	}

	private static void adicionarContatoPosicao(Scanner scan, ArrayList<Aula10Contato> lista) {

		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Entre com o nome: ", scan);
		String telefone = lerInformacao("Entre com telefone: ", scan);
		String email = lerInformacao("Entre com e-mail: ", scan);
		System.out.println("Informe a posição que deseja adicionar: ");

		Aula10Contato contato = new Aula10Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

		try {
			lista.add(posicao, contato);

			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato);

		} catch(Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}

	}
	
	protected static void criarContatosDinamicamente(int quantidade, ArrayList<Aula10Contato> lista) {

		Aula10Contato contato;

		for(int i=1; i<=quantidade; i++) {

			contato = new Aula10Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("11111"+i);
			contato.setEmail("contato"+i+"@email.com");

			lista.add(contato);
		}

	}

}
