package br.com.projetodesoftware.criacionais.abstractfactory;

public class FiestaSedan implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		System.out.println("Modelo: Fiesta Sedan\nCategoria: Sedan");
	}

}
