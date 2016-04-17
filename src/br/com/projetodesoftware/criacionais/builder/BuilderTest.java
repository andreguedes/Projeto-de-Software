package br.com.projetodesoftware.criacionais.builder;

public class BuilderTest {

	public static void main(String[] args) {
		ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
		concessionaria.construirCarro();
		
		CarroProduct carro = concessionaria.getCarro();
		exibeCarroInfo(carro);
		
		System.out.println("\n");
		
		concessionaria = new ConcessionariaDirector(new VolksBuilder());
		concessionaria.construirCarro();
		
		carro = concessionaria.getCarro();
		exibeCarroInfo(carro);
	}
	
	private static void exibeCarroInfo(final CarroProduct carro) {
		System.out.println("Carro: " + carro.modelo
				+ "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao
				+ "\nMotor: " + carro.descricaoMotor + "\nValor: " + carro.preco);
	}
	
}
