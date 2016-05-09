package aai;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.6
 * 2016-05-09T08:42:25.980-05:00
 * Generated source version: 3.0.6
 * 
 */
@WebService(targetNamespace = "http://aai/", name = "AaiService")
@XmlSeeAlso({ObjectFactory.class})
public interface AaiService {

    @WebMethod
    @RequestWrapper(localName = "fixes", targetNamespace = "http://aai/", className = "aai.Fixes")
    @ResponseWrapper(localName = "fixesResponse", targetNamespace = "http://aai/", className = "aai.FixesResponse")
    @WebResult(name = "return", targetNamespace = "")
    public aai.Mechanic fixes(
        @WebParam(name = "arg0", targetNamespace = "")
        aai.Car arg0
    );
}
