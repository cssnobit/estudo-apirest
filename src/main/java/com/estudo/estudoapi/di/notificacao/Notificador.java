package com.estudo.estudoapi.di.notificacao;

import com.estudo.estudoapi.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}