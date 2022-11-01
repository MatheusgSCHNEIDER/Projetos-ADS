package uninter;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Cofrinho cofre = new Cofrinho();
		System.out.println("----MENU----");
		System.out.println("1- Adicionar Moeda");
		System.out.println("2- Remover Moeda");
		System.out.println("3- Conteúdo do Cofrinho");
		System.out.println("4- Valor do Cofrinho em R$");
		System.out.println("5- SAIR");
		opcao = teclado.nextInt();
		Moeda m;
		m = null;
		while (opcao != 5) { //ENQUANTO A OPÇÃO INPUTADA NAO FOR 5 ENTRA NO LOOP
			
			switch (opcao) {
			case 1:
				int nacionalidadeMoeda=0;
				while(nacionalidadeMoeda>3 || nacionalidadeMoeda<1) { //LOOP DE REPETIÇÃO PERMITINDO SOMENTE ENTRADAS ENTE 1 E 3
				System.out.println("Qual a moeda a ser adicionada?");
				System.out.println("1- Real");
				System.out.println("2- Dólar");
				System.out.println("3- Euro");
				nacionalidadeMoeda = teclado.nextInt();
				}
				
				if (nacionalidadeMoeda == 1) {
					String nome = "Real";
					System.out.println("Moeda Real: Digite o Valor da Moeda:");
					double valor = teclado.nextDouble();
					m = new Real(valor,nome);
				}
				else if (nacionalidadeMoeda == 2) {
					String nome = "Dolar";
					System.out.println("Moeda Dolar: Digite o Valor da Moeda:");
					double valor = teclado.nextDouble();
					m = new Dolar(valor,nome);
				}
				else if (nacionalidadeMoeda == 3) {
					String nome = "Euro";
					System.out.println("Moeda Euro: Digite o Valor da Moeda:");
					double valor = teclado.nextDouble();
					m = new Euro(valor,nome);
				}
				cofre.adicionar(m);
				break;
			case 2:
				nacionalidadeMoeda=0;
				while(nacionalidadeMoeda>3 || nacionalidadeMoeda<1) { //LOOP DE REPETIÇÃO PERMITINDO SOMENTE ENTRADAS ENTE 1 E 3
				System.out.println("Qual a moeda a ser removida?");
				System.out.println("1- Real");
				System.out.println("2- Dólar");
				System.out.println("3- Euro");
				nacionalidadeMoeda = teclado.nextInt();
				}
				if (nacionalidadeMoeda == 1) {
					String nome = "Real";
					System.out.println("Moeda Real: Digite o Valor da Moeda:");
					double valor = teclado.nextDouble();
					m = new Real(valor,nome);
				}
				else if (nacionalidadeMoeda == 2) {
					String nome = "Dolar";
					System.out.println("Moeda Dolar: Digite o Valor da Moeda:");
					double valor = teclado.nextDouble();
					m = new Dolar(valor,nome);
				}
				else if (nacionalidadeMoeda == 3) {
					String nome = "Euro";
					System.out.println("Moeda Euro: Digite o Valor da Moeda:");
					double valor = teclado.nextDouble();
					m = new Euro(valor,nome);
				}
				cofre.remover(m);
				break;
			case 3:
				cofre.listagemMoedas();
				break;
			case 4:
				cofre.totalConvertido();
				break;
			default: 
				System.out.println("!!!OPÇÃO INVALIDA!!!");	//CASO DIGITAR ALGUM NUMERO QUE NÃO SE ENCAIXA EM NENHUM CASE
			}
			System.out.println("----MENU----");    //MENU QUE REPETE NO LOOP WHILE
			System.out.println("1- Adicionar Moeda");
			System.out.println("2- Remover Moeda");         
			System.out.println("3- Conteúdo do Cofrinho");
			System.out.println("4- Valor do Cofrinho em R$");
			System.out.println("5- SAIR");
			opcao = teclado.nextInt();
		}
	System.out.println("Programa encerrado");	//QUANDO SAIR DO LOOP WHILE
	}

	}


