package br.com.projetodesoftware.criacionais.factory;

public class EmRetorno extends Cliente {

	@Override
	MensagemDeCorreio obterMensagem() {
		return new MensagemDeCorreio("Bem-vindo novamente caro cliente!");
	}

}
