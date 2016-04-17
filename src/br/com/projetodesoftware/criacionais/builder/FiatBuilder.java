package br.com.projetodesoftware.criacionais.builder;

public class FiatBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 25000.0;
	}

	@Override
	public void buildDescricaoMotor() {
		carro.descricaoMotor = "Fire Flex 1.0";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2011;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Palio";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Fiat";
	}

}