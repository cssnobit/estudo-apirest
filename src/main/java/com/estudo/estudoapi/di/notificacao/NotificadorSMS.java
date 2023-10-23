package com.estudo.estudoapi.di.notificacao;

import org.springframework.stereotype.Component;

import com.estudo.estudoapi.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}