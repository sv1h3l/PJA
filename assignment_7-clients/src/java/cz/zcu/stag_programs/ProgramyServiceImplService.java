
package cz.zcu.stag_ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * Eclipse Metro/4.0.2 (RELEASE-4.0.2-ffda8c0; 2023-01-31T10:50:38+0000) XMLWS-Impl/4.0.1 XMLWS-API/4.0.0 XMLB-Impl/4.0.2 XMLB-API/4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ProgramyServiceImplService", targetNamespace = "http://stag-ws.zcu.cz/", wsdlLocation = "https://stagservices.upol.cz/ws/services/soap/programy?wsdl")
public class ProgramyServiceImplService
    extends Service
{

    private static final URL PROGRAMYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private static final WebServiceException PROGRAMYSERVICEIMPLSERVICE_EXCEPTION;
    private static final QName PROGRAMYSERVICEIMPLSERVICE_QNAME = new QName("http://stag-ws.zcu.cz/", "ProgramyServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://stagservices.upol.cz/ws/services/soap/programy?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PROGRAMYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        PROGRAMYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ProgramyServiceImplService() {
        super(__getWsdlLocation(), PROGRAMYSERVICEIMPLSERVICE_QNAME);
    }

    public ProgramyServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROGRAMYSERVICEIMPLSERVICE_QNAME, features);
    }

    public ProgramyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, PROGRAMYSERVICEIMPLSERVICE_QNAME);
    }

    public ProgramyServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROGRAMYSERVICEIMPLSERVICE_QNAME, features);
    }

    public ProgramyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProgramyServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProgramyService
     */
    @WebEndpoint(name = "ProgramyServiceImplPort")
    public ProgramyService getProgramyServiceImplPort() {
        return super.getPort(new QName("http://stag-ws.zcu.cz/", "ProgramyServiceImplPort"), ProgramyService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProgramyService
     */
    @WebEndpoint(name = "ProgramyServiceImplPort")
    public ProgramyService getProgramyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://stag-ws.zcu.cz/", "ProgramyServiceImplPort"), ProgramyService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROGRAMYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw PROGRAMYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return PROGRAMYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
