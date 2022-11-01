package uninter;

public class Dolar extends Moeda{



public Dolar(double valor, String nome) {
		super(valor, nome);
		
	}

@Override
double info() {
	System.out.println("Moeda: "+ nome);
	System.out.println("Valor = "+ valor);
	System.out.println("--------------");
	return 0;
}

@Override
double converter() {
	double valorConvertido = 0;
	valorConvertido = valor*5.29;
	return valorConvertido;
}

@Override
public int hashCode() {
	return super.hashCode();
}

@Override
public boolean equals(Object obj) { //PARA ACHAR O OBJETO QUE QUERO EXCLUIR NA ARRAYLIST
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	return true;
}

}
