package br.com.map.padradeprojeto.abstractfactory;

public class Pizzaria {

	private Fabrica fabrica;
	
	private Pizza pizza;

	public Pizzaria(Fabrica fabrica) {
		this.fabrica = fabrica;
	}

	public Fabrica getFabrica() {
		return fabrica;
	}

	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
	}
		

	public Pizza pedirPizza(String tipo) {
		return fabrica.getPizza(tipo);
	}

	public Pizza getPizza(String tipo) {
		return fabrica.getPizza(tipo);
	}
}
