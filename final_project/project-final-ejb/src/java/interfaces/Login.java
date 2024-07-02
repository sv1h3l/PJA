package interfaces;

import jakarta.ejb.Local;

/**
 * Třída Login je zodpovědná za správu přihlašování a odhlašování
 uživatelů do aplikace.
 */
@Local
public interface Login {

    public boolean loggedUser();

    public boolean login();

    public String getUserName();

    public void logout();

    public void back();

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail();

    public void setEmail(String email);

    public String getPassword();

    public void setPassword(String password);

    public String getErrorMessage();
    // </editor-fold>
}
