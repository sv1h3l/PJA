package interfaces;

import jakarta.ejb.Local;
import models.User;

/**
 * Třída reprezentující aktivní relaci uživatele.
 * Uchovává informace o aktuálně přihlášeném uživateli a jeho stavu přihlášení.
 */
@Local
public interface ActiveSession{

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public User getUser();

    public void setUser(User user);

    public boolean isUserLoggedIn();

    public void setUserLoggedIn(boolean userLoggedIn);
    // </editor-fold>
}
