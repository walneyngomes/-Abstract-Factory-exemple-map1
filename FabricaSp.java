package br.com.map.padradeprojeto.abstractfactory;

public class FabricaSp implements Fabrica{

	Pizza pizza = null;
	
	@Override
	public Pizza getPizza(String tipo) {
		if("calabresa".equalsIgnoreCase(tipo)) {
			pizza = new PizzaCalabresaPaulista();
		}
		else if("napolitana".equalsIgnoreCase(tipo)) {
			pizza = new PizzaNapolitanaPaulisa();
		}
		return pizza;
	}

}
