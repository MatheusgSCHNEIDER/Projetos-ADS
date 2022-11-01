package uninter;

import java.util.Objects;

public abstract class Moeda {
double valor;
String nome;

public Moeda(double valor, String nome) {
	super();
	this.valor = valor;
	this.nome = nome;
}



 abstract double info();
	


	


abstract double converter();



@Override
public int hashCode() {
	return Objects.hash(nome, valor);
}



@Override
public boolean equals(Object obj) { //PARA ACHAR O OBJETO QUE QUERO EXCLUIR NA ARRAYLIST
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Moeda other = (Moeda) obj;
	return Objects.equals(nome, other.nome) && Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
}



}


	
