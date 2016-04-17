package br.com.projetodesoftware.criacionais.builder;

public class ConcessionariaDirector {

	protected CarroBuilder montadora;
	
	public ConcessionariaDirector(CarroBuilder montadora) {
		this.montadora = montadora;
	}
	
	public void construirCarro() {
		montadora.buildPreco();
		montadora.buildAnoDeFabricacao();
		montadora.buildDescricaoMotor();
		montadora.buildModelo();
		montadora.buildMontadora();
	}
	
	public CarroProduct getCarro() {
		return this.montadora.getCarro();
	}
}