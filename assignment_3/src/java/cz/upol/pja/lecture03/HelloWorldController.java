package cz.upol.pja.lecture03;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * Controller pro hello-world priklad s AJAXem
 */
@Named("hello")
@RequestScoped
public class HelloWorldController {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        if (name == null) {
            return "";
        }
        return "HELLO " + name.toUpperCase() + "!";
    }
}
