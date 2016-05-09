package aao;

import org.apache.camel.builder.RouteBuilder;

public class AaoRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
    	from("cxf:bean:entryEndpoint").to("direct:two");
    	from("direct:two").to("jpa:aal.domain.Cd").process("aaoProcessor");
    }
}
