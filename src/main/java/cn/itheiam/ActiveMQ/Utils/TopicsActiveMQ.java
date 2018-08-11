package cn.itheiam.ActiveMQ.Utils;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class TopicsActiveMQ {
	@Autowired
	@Qualifier("jmsTopicTemplate")
	private JmsTemplate jmstemplate;
	
	public void send(String topicsname,final String message) {
		jmstemplate.send(topicsname,new MessageCreator() {
			
			public Message createMessage(Session session) throws JMSException {
				
				return session.createTextMessage(message);
			}
		});
	}
}
