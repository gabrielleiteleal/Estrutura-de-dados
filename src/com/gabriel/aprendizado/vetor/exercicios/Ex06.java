package com.gabriel.aprendizado.vetor.exercicios;

import java.util.Scanner;

import com.gabriel.aprendizado.vetor.Lista;
import com.gabriel.aprendizado.vetor.teste.Aula10Contato;

public class Ex06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Lista<Aula10Contato> lista = new Lista<Aula10Contato>(20);

		criarContatosDinamicamente(5, lista);
		//System.out.println(lista);

		int opcao = 1;

		while(opcao != 0) {
			opcao = obterOpcaoMenu(scan);

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

	private static void imprimirVetor(Lista<Aula10Contato> lista) {


		System.out.println(lista);


	}

	private static void limparVetor(Lista<Aula10Contato> lista) {

		try {

			lista.limpar();
			System.out.println("A lista foi limpada com sucesso!");

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void tamanhoVetor(Lista<Aula10Contato> lista) {

		try {

			System.out.println("O tamanho do vetor é: " + lista.tamanho());

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void excluirContatoPosicao(Scanner scan, Lista<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Excluir contato de qual posição: ", scan);

		try {

			lista.remover(pos);

			System.out.println("Contato excluído com sucesso!");

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void excluirContato(Scanner scan, Lista<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Excluir contato de qual posição: ", scan);

		try {

			Aula10Contato contato = lista.buscar(pos);

			lista.remover(contato);

			System.out.println("Contato excluído com sucesso!");

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void consultaContatoExiste(Scanner scan, Lista<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.buscar(pos); 



			boolean contain = lista.contain(contato);

			if(contain) {
				pos = lista.buscarElemento(contato);
				System.out.println("O contato existe na lista, na posição " + pos);
				System.out.println("Contato existente, seguem dados: ");
				System.out.println(contato);
			}

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void consultaUltimoIndice(Scanner scan, Lista<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.buscar(pos); 

			System.out.println("Contato existente, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do último índice do contato encontrado: ");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição " + pos);

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}

	}

	private static void obtemContatoPosicao(Scanner scan, Lista<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.buscar(pos); 

			System.out.println("Contato existente, seguem dados: ");
			System.out.println(contato);
		}catch(Exception e) {
			System.out.println("Posição inválida");
		}



	}

	private static void obtemContato(Scanner scan, Lista<Aula10Contato> lista) {

		int pos = lerInformacaoInt("Consultar contato de qual posição: ", scan);

		try {
			Aula10Contato contato = lista.buscar(pos); 

			System.out.println("Contato existente, seguem dados: ");
			System.out.println(contato);

			System.out.println("Fazendo pesquisa do contato encontrado: ");
			pos = lista.buscarElemento(contato);

			System.out.println("Contato encontrado na posição " + pos);

		}catch(Exception e) {
			System.out.println("Posição inválida");
		}



	}

	private static void adicionarContatoFinal(Scanner scan, Lista<Aula10Contato> lista) {

		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Entre com o nome: ", scan);
		String telefone = lerInformacao("Entre com telefone: ", scan);
		String email = lerInformacao("Entre com e-mail: ", scan);

		Aula10Contato contato = new Aula10Contato(nome, telefone, email);

		lista.adicionar(contato);

		System.out.println("Contato adicionado com sucesso");
		System.out.println(contato);

	}

	private static void adicionarContatoPosicao(Scanner scan, Lista<Aula10Contato> lista) {

		System.out.println("Criando um contato, entre com as informações");
		String nome = lerInformacao("Entre com o nome: ", scan);
		String telefone = lerInformacao("Entre com telefone: ", scan);
		String email = lerInformacao("Entre com e-mail: ", scan);
		System.out.println("Informe a posição que deseja adicionar: ");

		Aula10Contato contato = new Aula10Contato(nome, telefone, email);

		int posicao = lerInformacaoInt("Entre com a posição a adicionar o contato", scan);

		try {
			lista.adicionar(posicao, contato);

			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato);

		} catch(Exception e) {
			System.out.println("Posição inválida, contato não adicionado");
		}

	}

	public static String lerInformacao(String msg, Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;
	}

	public static int lerInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;
		int num = 0;

		while(!entradaValida) {

			try {
				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			}catch(Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}

		}



		return num;
	}

	private static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 0;
		String entrada;

		while(!entradaValida) {
			System.out.println("1: Adiciona contato no final do vetor");
			System.out.println("2: Adiciona contato em uma posição específica");
			System.out.println("3: Consulta contato de uma posição específica");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice do contato");
			System.out.println("6: Verifica se contato existe");
			System.out.println("7: Excluir por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contato do vetor");
			System.out.println("11: Imprime o vetor");
			System.out.println("0: Sair");

			try {

				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >=0 && opcao < 12) {
					entradaValida = true;
				}else {
					throw new Exception();
				}

			}catch(Exception e) {
				System.out.println("Entrada inválida, digite novamente\n\n");
			}

		}

		return opcao;
	}

	protected static void criarContatosDinamicamente(int quantidade, Lista<Aula10Contato> lista) {

		Aula10Contato contato;

		for(int i=1; i<=quantidade; i++) {

			contato = new Aula10Contato();
			contato.setNome("Contato " + i);
			contato.setTelefone("11111"+i);
			contato.setEmail("contato"+i+"@email.com");

			lista.adicionar(contato);
		}

	}

}
