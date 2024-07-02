package beans;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import models.User;
import interfaces.ActiveSession;
import interfaces.Database;
import interfaces.Login;
import interfaces.Profile;

/**
 * Třída LoginBean je zodpovědná za správu přihlašování a odhlašování uživatelů
 * do aplikace.
 */
@Stateless
public class LoginBean implements Login {

    @EJB
    private ActiveSession activeSessionBean;

    @EJB
    private Database databaseBean;

    @EJB
    private Profile profileBean;

    private String email;
    private String password;
    
    /**
     * Přihlášení není řešeno validátorem, protože je nutné navázání spojení s databázi.
     */
    private String errorMessage = "";

    public boolean loggedUser() {
        return activeSessionBean.isUserLoggedIn();
    }

    public boolean login() {
        User user = databaseBean.login(email, password);

        if (user != null) {
            activeSessionBean.setUser(user);
            activeSessionBean.setUserLoggedIn(true);
            profileBean.init();
            errorMessage = "";
            return true;
        } else {
            password = new String();
            errorMessage = " • Email nebo heslo není správné.";
            return false;
        }
    }

    public String getUserName() {
        return activeSessionBean.getUser().getFirstName() + " " + activeSessionBean.getUser().getSecondName();
    }

    public void logout() {
        activeSessionBean.setUser(null);
        activeSessionBean.setUserLoggedIn(false);
    }

    public void back() {
        errorMessage = "";
        email = new String();
        password = new String();
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
    // </editor-fold>
}
