
package cz.upol.pja.lecture05.controllers;

import cz.upol.pja.lecture05.UserManager;
import cz.upol.pja.lecture05.models.User;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * Controller pro registracni formular
 */
@Named("register")
@RequestScoped
public class RegisterController {
    
    @Inject private UserManager userManager;
    
    private String loginName;
    private String firstName;
    private String secondName;
    private String password;
    private String confirmPassword;
    
    public RegisterController() {
        super();
    }
    
    public String createUser() {
        userManager.addUser(new User(loginName, UserManager.getPasswdHash(password), firstName, secondName));
        return "list";
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
