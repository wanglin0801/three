package cn.com.besttone.service.amqp;

import cn.com.besttone.config.AmqpConfig;
import cn.com.besttone.entity.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;



/**
 * 消息队列消费者
 *
 * @author
 *
 */
@Component
@RabbitListener(queues = AmqpConfig.QUEUENAME)
public class MessageConsumer {
	
	private final Logger log = LoggerFactory.getLogger(MessageConsumer.class);

	@RabbitHandler
	public void process(Customer message) {

		log.info("Receive message : {}. ", message.getFirstName());

	}

}
