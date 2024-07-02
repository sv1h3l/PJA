package cz.upol.pja.lecture03.validators;

import cz.upol.pja.lecture03.RestrictedWordsController;
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
@Named("restrictedWordValidator")
public class RestrictedWordValidator implements Validator<String> {

    @Inject
    private RestrictedWordsController restrictedWordsController;

    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        if (restrictedWordsController.checkSpaceAndEmptiness(value)) {
            FacesMessage msg = new FacesMessage("You have to enter non-empty word without spaces.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        } else if (restrictedWordsController.checkRestrictedWords(value)) {
            FacesMessage msg = new FacesMessage("This word is already restricted.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }
}
