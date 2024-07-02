package cz.upol.pja.lecture06clients;

import cz.upol.pja.lecture06.ServiceBmi;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;

@RequestScoped
@Named("serviceBmi")
public class ServiceBmiCtl {

    /*@WebServiceRef(HelloService_Service.class)
    private HelloService helloService;*/
    private String weight;
    private String height;
    private String output = "";


    public void getBmi() {
        try {
            URL wsdl = new URL("http://localhost:8080/lecture06/ServiceBmi?wsdl");
            QName serviceName = new QName("http://lecture06.pja.upol.cz/", "ServiceBmi");

            Service service = Service.create(wsdl, serviceName);
            ServiceBmi serviceBmi = service.getPort(ServiceBmi.class);
            output = serviceBmi.calculateBmi(weight, height);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ServiceBmiCtl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
