package br.com.projetodesoftware.criacionais.factory;

import br.com.projetodesoftware.criacionais.factory.AplicacaoDeGeracaoDeEmail.TipoCliente;


public class GeracaoDeEmails {
	
	// EXEMPLO DE APLICACAO DO PADRAO FACTORY - Geracao de mensagem de correio eletronico
	// A partir de uma unica versao de codigo de controle, gere mensagens de correio eletronico
	// personalizadas para varios clientes.

	public static void main(String[] args) {
		String emailDoCliente = "nomedocliente@provedor.com";
		
		Cliente tipoCliente = AplicacaoDeGeracaoDeEmail.obterTipoDeClienteDoUsuario(TipoCliente.EM_RETORNO);
		
		MensagemDeCorreio mensagemParaCliente = tipoCliente.obterMensagem();
		
		AplicacaoCliente.enviarMensagem(mensagemParaCliente, emailDoCliente);
	}

}
