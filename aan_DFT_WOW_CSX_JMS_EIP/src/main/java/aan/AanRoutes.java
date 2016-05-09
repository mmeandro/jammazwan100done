package aan;

import org.apache.camel.builder.RouteBuilder;

public class AanRoutes extends RouteBuilder {

	public void configure() throws Exception {
		from("cxf:bean:entryEndpoint").process("aanProcessor").wireTap("jms:two");
		from("jms:two").process("processorTwo").to("file://../_test/");
	}

}