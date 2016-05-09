package adk;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class AdkRoutes extends RouteBuilder {

	@Autowired
	private AdkProcessor exampleBean;

	@Override
	public void configure() throws Exception {
		from("direct:one").process("adkProcessor").to("direct:two");
		from("direct:two").to("file://../_test/").to("ftp://192.168.99.100/?username=petec&password=frog").log("DONE");
	}
}
