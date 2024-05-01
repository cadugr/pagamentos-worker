package com.pagamentosworker.infrastructure.consumer;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.pagamentosworker.infrastructure.producer.PagamentoErroProdutor;
import com.pagamentosworker.infrastructure.producer.PagamentoSucessoProdutor;

@Component
public class PagamentoRequestConsumidor {
    
    @Autowired 
    private PagamentoErroProdutor erroProdutor;
    @Autowired 
    private PagamentoSucessoProdutor sucessoProdutor;

    @SuppressWarnings("rawtypes")
    @RabbitListener(queues = {"pagamento-request-queue"})
    public void receive(@Payload Message message) {
        System.out.println("Message " + message + "  " + LocalDateTime.now());
        String payload = String.valueOf(message.getPayload());

        if (new Random().nextBoolean()) {
            sucessoProdutor.gerarResposta("Recebido com SUCESSO: "+ payload);
        } else {
            erroProdutor.gerarResposta("Recebido com ERRO: "+ payload);
        }
    }
}
