package adn;

import org.apache.camel.builder.RouteBuilder;

public class AdnRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("adnProcessor").wireTap("direct:two");
		from("direct:two").process("processorTwo").to("file://../_test/");
	}

}