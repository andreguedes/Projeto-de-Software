package br.com.projetodesoftware.criacionais.factory;

public class Novato extends Cliente {

	@Override
	MensagemDeCorreio obterMensagem() {
		return new MensagemDeCorreio("Seja muito bem-vindo!");
	}

}
