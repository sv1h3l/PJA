package cz.upol.pja.lecture07.controllers;

import cz.upol.pja.lecture07.api.UserInt;
import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@RequestScoped
@Named("usersCtl")
public class UserController implements Serializable {

    @EJB
    private UserInt userInt;

    public UserController() {
    }

    public List<User> getUsers() {
        return userInt.getUsers();
    }

    public synchronized User getUser(String loginName, String passwdHash) {
        return userInt.getUser(loginName, passwdHash);
    }

    public String saveForm() {
        userInt.saveForm();
        return "list";
    }

    public String delete(User user) {
        userInt.delete(user);
        return "";
    }

    public String getPasswdHash(String passwd) {
        return userInt.getPasswdHash(passwd);
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getLoginName() {
        return userInt.getLoginName();
    }

    public void setLoginName(String loginName) {
        userInt.setLoginName(loginName);
    }

    public String getPassword() {
        return userInt.getPassword();
    }

    public void setPassword(String password) {
        userInt.setPassword(password);
    }

    public String getConfirmPassword() {
        return userInt.getConfirmPassword();
    }

    public void setConfirmPassword(String confirmPassword) {
        userInt.setConfirmPassword(confirmPassword);
    }

    public String getFirstName() {
        return userInt.getFirstName();
    }

    public void setFirstName(String firstName) {
        userInt.setFirstName(firstName);
    }

    public String getSecondName() {
        return userInt.getSecondName();
    }

    public void setSecondName(String secondName) {
        userInt.setSecondName(secondName);
    }

    // </editor-fold>
}
