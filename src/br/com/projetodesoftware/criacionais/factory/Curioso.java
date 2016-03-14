package br.com.projetodesoftware.criacionais.factory;

public class Curioso extends Cliente {

	@Override
	MensagemDeCorreio obterMensagem() {
		return new MensagemDeCorreio("Venha nos conhecer!!!");
	}

}
