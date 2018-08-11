package cn.itheiam.ActiveMQ.Customer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Service;
@Service
public class QueueConsumer1 implements MessageListener{

	public void onMessage(Message message) {
		TextMessage textMessage=(TextMessage) message;
		try {
			System.out.println("QueueConsumer1获取的消息"+textMessage.getText());
		} catch (JMSException e) {
			
			e.printStackTrace();
		}
		
	}

}
