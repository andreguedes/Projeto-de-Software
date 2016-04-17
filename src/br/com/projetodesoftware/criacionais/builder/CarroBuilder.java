package br.com.projetodesoftware.criacionais.builder;

public abstract class CarroBuilder {

	protected CarroProduct carro;
	
	public CarroBuilder() {
		this.carro = new CarroProduct();
	}
	
	public abstract void buildPreco();
	public abstract void buildDescricaoMotor();
	public abstract void buildAnoDeFabricacao();
	public abstract void buildModelo();
	public abstract void buildMontadora();
	
	public CarroProduct getCarro() {
		return this.carro;
	}
	
}