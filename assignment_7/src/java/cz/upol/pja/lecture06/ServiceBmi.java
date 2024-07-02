package cz.upol.pja.lecture06;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "ServiceBmi")
public class ServiceBmi {

    @WebMethod(operationName = "calculateBmi")
    public String calculateBmi(
            @WebParam(name = "weight") String weight,
            @WebParam(name = "height") String height) {

        Bmi bmi = new Bmi();
        bmi.setWeight(weight);
        bmi.setHeight(height);

        return "Vaše BMI: " + bmi.calculateBMI() + "\nSpadáte do kategorie: " + bmi.calculateCategory();
    }
}
