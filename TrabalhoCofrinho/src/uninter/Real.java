package uninter;

public class Real extends Moeda {



	public Real(double valor, String nome) {
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
		return valor;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


}
