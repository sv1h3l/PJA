package controllers;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Date;
import interfaces.Register;

/**
 * Třída sloužící k ovládání procesu registrace uživatele.
 */
@SessionScoped
@Named("registerController")
public class RegisterController implements Serializable { 

    @EJB
    private Register register;

    public RegisterController() {
    }

    public String back() {
        register.back();

        return "start";
    }

    public String register() {
        register.register();
        
        return "login";
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail() {
        return register.getEmail();
    }

    public void setEmail(String email) {
        register.setEmail(email);
    }

    public String getPassword() {
        return register.getPassword();
    }

    public void setPassword(String password) {
        register.setPassword(password);
    }

    public String getConfirmPassword() {
        return register.getConfirmPassword();
    }

    public void setConfirmPassword(String confirmPassword) {
        register.setConfirmPassword(confirmPassword);
    }

    public String getFirstName() {
        return register.getFirstName();
    }

    public void setFirstName(String firstName) {
        register.setFirstName(firstName);
    }

    public String getSecondName() {
        return register.getSecondName();
    }

    public void setSecondName(String secondName) {
        register.setSecondName(secondName);
    }

    public Date getDateOfRegistration() {
        return register.getDateOfRegistration();
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        register.setDateOfRegistration(dateOfRegistration);
    }

    public String getSomatotype() {
        return register.getSomatotype();
    }

    public void setSomatotype(String somatotype) {
        register.setSomatotype(somatotype);
    }

    public String getForwardness() {
        return register.getForwardness();
    }

    public void setForwardness(String forwardness) {
        register.setForwardness(forwardness);
    }

    public int getAttendance() {
        return register.getAttendance();
    }

    public void setAttendance(int attendance) {
        register.setAttendance(attendance);
    }

    public String getTrainingDuration() {
        return register.getTrainingDuration();
    }

    public void setTrainingDuration(String trainingDuration) {
        register.setTrainingDuration(trainingDuration);
    }

    // </editor-fold>
}
