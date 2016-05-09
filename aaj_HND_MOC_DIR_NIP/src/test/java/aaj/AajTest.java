package aaj;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AajTest extends CamelSpringTestSupport{

	@Override
	protected AbstractApplicationContext createApplicationContext() {
        return new ClassPathXmlApplicationContext("META-INF/spring/camel-context.xml");
	}
	
	@Test
	public  void testAag()throws Exception{
		Thread.sleep(3000);
	}

}
