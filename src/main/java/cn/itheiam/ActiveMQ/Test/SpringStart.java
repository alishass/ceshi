package cn.itheiam.ActiveMQ.Test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-mq.xml")
public class SpringStart {

	//通过Junit开启spring初始化,再通过死循环,防止Junit的线程结束,将spring 的监听结束
	@org.junit.Test
	public void Test() {
		while (true) {
			
			
		}
	}
}
