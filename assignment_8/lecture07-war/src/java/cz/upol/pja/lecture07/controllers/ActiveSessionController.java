package cz.upol.pja.lecture07.controllers;

import cz.upol.pja.lecture07.api.ActiveSessionInt;
import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.EJB;
import java.io.Serializable;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

/**
 * Jednoduche sezeni obsahujici aktualniho uzivatele
 */
@SessionScoped
@Named("activeSession")
public class ActiveSessionController implements Serializable {

    @EJB
    private ActiveSessionInt activeSessionInt;

    public User getUser() {
        return activeSessionInt.getUser();
    }

    public void setUser(User user) {
        activeSessionInt.setUser(user);
    }

    public boolean userLoggedIn() {
        return activeSessionInt.userLoggedIn();
    }
}
