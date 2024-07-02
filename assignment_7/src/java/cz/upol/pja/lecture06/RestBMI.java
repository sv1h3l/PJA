package cz.upol.pja.lecture06;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bmi")
public class RestBMI {

    @GET
    @Produces(MediaType.TEXT_PLAIN + ";charset=UTF-8")
    public String formBmi() {
        return "Musíte specifikovat vaši váhu a výšku pro výpočet bmi.";
    }

    @GET
    @Path("{value}")
    @Produces(MediaType.TEXT_PLAIN + ";charset=UTF-8")
    public String warningBmi(@PathParam("value") String value) {
        return "Musíte specifikovat vaši váhu a výšku pro výpočet bmi.";
    }

    @GET
    @Path("{weight}/{height}")
    @Produces(MediaType.TEXT_PLAIN + ";charset=UTF-8")
    public String calculateBmi(@PathParam("weight") String weight, @PathParam("height") String height) {

        Bmi bmi = new Bmi();
        bmi.setWeight(weight);
        bmi.setHeight(height);

        return "Vaše BMI: " + bmi.calculateBMI() + "\nSpadáte do kategorie: " + bmi.calculateCategory();
    }
}
