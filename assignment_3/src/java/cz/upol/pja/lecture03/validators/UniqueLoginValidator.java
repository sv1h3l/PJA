package cz.upol.pja.lecture03.validators;

import cz.upol.pja.lecture03.UserManager;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * Pozor! Tento validator je managed bean!
 */
@RequestScoped
@Named("uniqueLoginValidator")
public class UniqueLoginValidator implements Validator<String> {
    
    @Inject private UserManager userManager;

    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        if (userManager.existsUser(value)) {
            FacesMessage msg = new FacesMessage("User already exists");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
    
}