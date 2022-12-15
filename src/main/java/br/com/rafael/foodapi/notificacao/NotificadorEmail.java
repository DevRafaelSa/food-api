package br.com.rafael.foodapi.notificacao;

import br.com.rafael.foodapi.models.Cliente;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class NotificadorEmail {

    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
