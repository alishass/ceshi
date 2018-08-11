package cn.itheiam.ActiveMQ.Test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itheiam.ActiveMQ.Utils.QueueActiveMQ;
import cn.itheiam.ActiveMQ.Utils.TopicsActiveMQ;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-mq.xml")
public class ActiveMQProduct {
	@Autowired
	private QueueActiveMQ queueActiveMQ;
	
	@Autowired
	private TopicsActiveMQ topicsActiveMQ;

	@Test
	public void Test01() {
		//spring整合添加Queue消息队列和Topics话题
		queueActiveMQ.send("a", "你好,Queue");
		topicsActiveMQ.send("b", "你好,Topics");
	}
}
