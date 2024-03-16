package controller;

public class Fatorial {

	public Fatorial() {
		super();
	}

	public int ffat(int valor) {
		if(valor == 1) {
			return valor;
		}
		return valor * ffat(valor - 1);
	}
}

