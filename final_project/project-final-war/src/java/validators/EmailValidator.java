package validators;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Named;

/**
 * Pozor! Tento validator je managed bean!
 */
@RequestScoped
@Named("emailValidator")
public class EmailValidator implements Validator<String> {

    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        if (MethodsForValidators.checkEmptiness(value) || MethodsForValidators.checkSpaces(value)) {
            FacesMessage msg = new FacesMessage("Email nesmí být prázdný a nesmí obsahovat mezery.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
