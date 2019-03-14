package br.com.map.padradeprojeto.abstractfactory;

public class FabricaRj implements Fabrica{

	Pizza pizza = null;
	
	@Override
	public Pizza getPizza(String tipo) {
		if("calabresa".equalsIgnoreCase(tipo)) {
			pizza = new PizzaCalabresaCarioca();
		}
		else if("napolitana".equalsIgnoreCase(tipo)) {
			pizza = new PizzaNapolitanaCarioca();
		}
		return pizza;
	}

}
