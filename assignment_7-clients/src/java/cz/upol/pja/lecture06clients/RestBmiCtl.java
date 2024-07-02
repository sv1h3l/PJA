package cz.upol.pja.lecture06clients;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.Response;

@RequestScoped
@Named("restBmi")
public class RestBmiCtl {

    private String weight;
    private String height;
    private String output = "";

    public void getBmi() {
        Client client = ClientBuilder.newClient();
        Response response = client.target("http://localhost:8080/lecture06/rest/bmi")
                .path(weight)
                .path(height)
                .request()
                .get();
        output = response.readEntity(String.class);
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
