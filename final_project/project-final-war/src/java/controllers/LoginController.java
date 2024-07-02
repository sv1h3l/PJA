package controllers;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import interfaces.Login;

/**
 * Třída LoginController je zodpovědná za správu přihlašování a odhlašování
 * uživatelů do aplikace.
 */
@SessionScoped
@Named("loginController")
public class LoginController implements Serializable {

    @EJB
    private Login login;

    public boolean loggedUser() {
        return login.loggedUser();
    }

    public String login() {
        if (login.login()) {
            return "profile";
        } else {
            return "";
        }
    }

    public String getUserName() {
        return login.getUserName();
    }

    public String logout() {
        login.logout();
        
        return "start";
    }

    public String back() {
        login.back();
        
        return "start";

    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail() {
        return login.getEmail();
    }

    public void setEmail(String email) {
        login.setEmail(email);
    }

    public String getPassword() {
        return login.getPassword();
    }

    public void setPassword(String password) {
        login.setPassword(password);
    }

    public String getErrorMessage() {
        return login.getErrorMessage();
    }
    // </editor-fold>
}
