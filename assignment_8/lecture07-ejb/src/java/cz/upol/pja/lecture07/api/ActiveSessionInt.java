package cz.upol.pja.lecture07.api;

import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.Local;

@Local
public interface ActiveSessionInt {

    public User getUser();

    public void setUser(User user);

    public boolean userLoggedIn();
}
