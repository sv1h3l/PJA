package cz.upol.pja.lecture04;

import cz.upol.pja.lecture04.models.User;
import java.io.Serializable;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

/**
 * Jednoduche sezeni obsahujici aktualniho uzivatele
 */
@SessionScoped
@Named("activeSession")
public class ActiveSession implements Serializable {

    private User user = null;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean userLoggedIn() {
        return user != null;
    }
}
