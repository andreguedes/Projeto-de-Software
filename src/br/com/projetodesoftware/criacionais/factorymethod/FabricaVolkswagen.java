package br.com.projetodesoftware.criacionais.factorymethod;

public class FabricaVolkswagen implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
