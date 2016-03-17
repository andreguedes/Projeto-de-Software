package br.com.projetodesoftware.criacionais.abstractfactory;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		
		FabricaDeCarro fabrica = new FabricaFiat();
		
		CarroSedan sedan = fabrica.criarCarroSedan();
		sedan.exibirInfoSedan();
		
		CarroPopular popular = fabrica.criarCarroPopular();
		popular.exibirInfoPopular();
		
		fabrica = new FabricaFord();
		
		sedan = fabrica.criarCarroSedan();
		sedan.exibirInfoSedan();
		
		popular = fabrica.criarCarroPopular();
		popular.exibirInfoPopular();
		
	}

}
