package edu.rafael.Curso.conhecendo_Java.POO.Pilares.Polimorfismo;

public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem(){
		System.out.println("Salvando historico de mensagens do MSN Messenger");
	}

	protected void validarConectadoInternet(){
		System.out.println("Validando se está conectado a internet");
	}
}