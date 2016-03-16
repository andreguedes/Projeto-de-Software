package br.com.projetodesoftware.criacionais.singleton;

public class FabricaDeCarro {

	public static FabricaDeCarro INSTANCE;
	
	protected FabricaDeCarro() {
	}
	
	public static FabricaDeCarro getInstance() {
		if (INSTANCE == null)
			INSTANCE = new FabricaDeCarro();
		return INSTANCE;
	}
}
