package com.estudo.estudoapi.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.estudo.estudoapi.di.notificacao.NivelUrgencia;
import com.estudo.estudoapi.di.notificacao.Notificador;
import com.estudo.estudoapi.di.notificacao.TipoDoNotificador;
import com.estudo.estudoapi.di.notificacao.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {

	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
	}
	
}
