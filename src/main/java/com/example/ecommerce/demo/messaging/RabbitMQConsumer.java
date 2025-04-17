package com.example.ecommerce.demo.messaging;

import com.example.ecommerce.demo.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void receive(String message) {
        System.out.println("Received message: " + message);
    }
}
