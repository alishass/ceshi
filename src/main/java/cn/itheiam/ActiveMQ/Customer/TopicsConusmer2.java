package cn.itheiam.ActiveMQ.Customer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Service;
@Service
public class TopicsConusmer2 implements MessageListener{

	public void onMessage(Message message) {
		TextMessage textMessage=(TextMessage) message;
		try {
			System.out.println("TopicsConusmer2获取的消息:"+textMessage.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
