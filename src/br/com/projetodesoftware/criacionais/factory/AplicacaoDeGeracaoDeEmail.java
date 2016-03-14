package br.com.projetodesoftware.criacionais.factory;

public class AplicacaoDeGeracaoDeEmail {
	
	enum TipoCliente {
		FREQUENTE, EM_RETORNO, CURIOSO, NOVATO
	}

	public static Cliente obterTipoDeClienteDoUsuario(final TipoCliente tipoDoCliente) {
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
				break;
		}
		return null;
	}
}
