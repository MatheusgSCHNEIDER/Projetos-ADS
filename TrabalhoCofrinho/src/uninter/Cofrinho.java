package uninter;

import java.util.ArrayList;

public class Cofrinho {
ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

public void adicionar(Moeda m) {
	listaMoeda.add(m);
}

public void remover(Moeda m) {
	int contadorInicial = 0;
	int contadorFinal = 0;
	for (Moeda n : listaMoeda) {
		contadorInicial+=1;
	}
	listaMoeda.remove(m);
	for (Moeda n : listaMoeda) {
		contadorFinal+=1;
	}
	if(contadorFinal == contadorInicial) { // SE A QUANTIDADE DE MOEDAS n EM LISTA MOEDA FOR IGUAL APOS A REMOÇÃO
		System.out.println("!!!Moeda inexistente!!!"); //LOGICAMENTE NENHUMA MOEDA FOI REMOVIDA
	}	
}
public void listagemMoedas() {
	System.out.println("LISTA DE MOEDAS:");
	for (Moeda m : listaMoeda) {
		m.info();
	}
}
public void totalConvertido() {
	double totalConv = 0;
	double valorConv = 0;
	for (Moeda m : listaMoeda) {
		valorConv = m.converter(); //CONVERSÃO PARA CADA MOEDA
		totalConv += valorConv; //SOMA DA CONVERSÃO MAIS CONVERSÕES ANTERIORES
	}
	System.out.printf("O valor total do cofre é R$ %.2f %n",totalConv);
}
}
