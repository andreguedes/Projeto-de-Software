package br.com.projetodesoftware.criacionais.builder;

public class VolksBuilder extends CarroBuilder {

	@Override
	public void buildPreco() {
		carro.preco = 23000.0;
	}

	@Override
	public void buildDescricaoMotor() {
		carro.descricaoMotor = "Gol Flex 1.0";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2013;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Gol";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Volks";
	}

}