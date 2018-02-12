package cn.com.besttone.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AmqpConfig {

    public static final String EXCHANGE   = "order-relation-exchange";
    public static final String ROUTINGKEY = "order-relation-routingKey";
    public static final String QUEUENAME = "order-relation-queue";





    @Bean
    public Queue queue() {
        return new Queue(QUEUENAME, true);
    }

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(QUEUENAME);
    }

}
