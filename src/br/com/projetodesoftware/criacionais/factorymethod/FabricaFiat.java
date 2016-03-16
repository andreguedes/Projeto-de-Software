package br.com.projetodesoftware.criacionais.factorymethod;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Palio();
	}

}
