package br.com.projetodesoftware.criacionais.factory;

public class AplicacaoDeGeracaoDeEmail {
	
	enum TipoCliente {
		FREQUENTE, EM_RETORNO, CURIOSO, NOVATO
	}

	public static Cliente obterTipoDeClienteDoUsuario(final TipoCliente tipoDoCliente) throws ClassNotFoundException {
		switch(tipoDoCliente) {
		case FREQUENTE:
			return new Frequente();
		case EM_RETORNO:
			return new EmRetorno();
		case CURIOSO:
			return new Curioso();
		case NOVATO:
			return new Novato();
		default:
			throw new ClassNotFoundException("Tipo de cliente nao definido");
		}
	}
}
