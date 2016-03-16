package br.com.projetodesoftware.criacionais.factorymethod;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}

}
