package br.com.projetodesoftware.criacionais.factory;

public class AplicacaoCliente {

	public static void enviarMensagem(MensagemDeCorreio mensagemDeCorreio, String emailDoCliente) {
		System.out.println("Mensagem '" + mensagemDeCorreio.getTexto() + "' enviada com sucesso para "
				+ "o cliente " + emailDoCliente);
	}
}
