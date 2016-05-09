package abf;

import org.apache.camel.builder.RouteBuilder;

public class AbfRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://abf?repeatCount=1").to("jms:one");
		from("jms:one").process("abfProcessor").to("jms:two");
		from("jms:two").to("jpa:abf.domain.Plant").log("DONE.");
	}
}
