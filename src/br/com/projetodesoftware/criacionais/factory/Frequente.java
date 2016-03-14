package br.com.projetodesoftware.criacionais.factory;

public class Frequente extends Cliente {

	@Override
	MensagemDeCorreio obterMensagem() {
		return new MensagemDeCorreio("Olá fiel cliente!");
	}

}
