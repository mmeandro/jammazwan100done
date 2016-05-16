package camelinaction.order;

import javax.jws.WebService;

//@WebService
@WebService(targetNamespace = "http://order.camelinaction", name = "OrderEndpoint")
public interface OrderEndpoint {
	String order(String partName, int amount, String customerName);
   // add a coment for git and another
}
