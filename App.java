package br.com.map.padradeprojeto.abstractfactory;

public class App {

	public static void main(String[] args) {

		Fabrica fabricaRj = new FabricaRj();
		Fabrica fabricaSp = new FabricaSp();
		
		Pizzaria pizzaria = new Pizzaria(fabricaSp);
		Pizza pedido = pizzaria.pedirPizza("calabresa");
		pedido.preparar();
		
		System.out.println(pedido);

 	
	}

}
