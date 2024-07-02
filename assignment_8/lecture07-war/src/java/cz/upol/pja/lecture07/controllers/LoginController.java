package cz.upol.pja.lecture07.controllers;

import cz.upol.pja.lecture07.api.LoginInt;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@RequestScoped
@Named("loginController")
public class LoginController {

    @EJB
    private LoginInt loginInt;

    public String login(String target) {
        return loginInt.login(target);
    }

    public String getLoginName() {
        return loginInt.getLoginName();
    }

    public void setLoginName(String loginName) {
        loginInt.setLoginName(loginName);
    }

    public String getPassword() {
        return loginInt.getPassword();
    }

    public void setPassword(String password) {
        loginInt.setPassword(password);
    }
}
