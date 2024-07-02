package cz.upol.pja.lecture07.beans;

import cz.upol.pja.lecture07.api.ActiveSessionInt;
import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.Stateless;
import java.io.Serializable;

@Stateless
public class ActiveSessionBean implements Serializable, ActiveSessionInt {

    private User user = null;

    public ActiveSessionBean() {
    }

    @Override
    public User getUser() {
        return user;
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean userLoggedIn() {
        return user != null;
    }
}
