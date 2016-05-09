package aap;

import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aap.domain.Cleaner;

public class AapTest extends CamelSpringTestSupport {

	@Override
	protected AbstractXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("META-INF/spring/camel-route.xml");
	}

	@Test
	public void testOrderOk() throws Exception {
//		 Thread.sleep(2000000);
		Cleaner cleaner = new Cleaner("Betty C. Thomas", "52", "vibrant health, but cranky", "modestly sloppy, not OCD");
		String reply = template.requestBody("cxf:bean:entryEndpoint", cleaner, String.class);
		assertEquals(reply, cleaner.toString());
		Thread.sleep(1000);
	}

}
