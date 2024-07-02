package cz.upol.pja.lecture05.validators;

import cz.upol.pja.lecture05.controllers.RestrictedWordsController;
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
@Named("forumWordsValidator")
public class ForumWordsValidator implements Validator<String> {

    @Inject
    private RestrictedWordsController restrictedWordsController;

    @Override
    public void validate(FacesContext context, UIComponent component, String value) throws ValidatorException {
        if (restrictedWordsController.checkRestridtedWordsInString(value)) {
            FacesMessage msg = new FacesMessage("You wrote restricted word.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        } 
    }
}
