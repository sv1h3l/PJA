package beans;

import jakarta.ejb.Stateless;
import models.User;
import interfaces.ActiveSession;

/**
 * Třída reprezentující aktivní relaci uživatele. Uchovává informace o aktuálně
 * přihlášeném uživateli a jeho stavu přihlášení.
 */
@Stateless
public class ActiveSessionBean implements ActiveSession {

    private User user = null;
    private boolean userLoggedIn = false;

    public ActiveSessionBean() {
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isUserLoggedIn() {
        return userLoggedIn;
    }

    public void setUserLoggedIn(boolean userLoggedIn) {
        this.userLoggedIn = userLoggedIn;
    }
    // </editor-fold>
}
