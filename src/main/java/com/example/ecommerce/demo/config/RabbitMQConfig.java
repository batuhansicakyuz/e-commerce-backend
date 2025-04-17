package com.example.ecommerce.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String QUEUE_NAME = "productQueue";
    public static final String EXCHANGE_NAME = "productExchange";
    public static final String ROUTING_KEY = "product.routingKey";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME, true); // durable true
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(ROUTING_KEY);
    }
}
