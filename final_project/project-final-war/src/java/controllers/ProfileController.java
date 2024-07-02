package controllers;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.sql.Date;
import interfaces.Profile;
import models.enums.TrainingDurationEnum;

/**
 * Tato třída slouží k ovládání procesu úpravy uživatelského profilu a k
 * zobrazování údajů.
 */
@SessionScoped
@Named("profileController")
public class ProfileController implements Serializable {

    @EJB
    private Profile profile;

    public ProfileController() {
    }

    @PostConstruct
    public void init() {
        profile.init();
    }

    public String change() {
        profile.change();

        return "profile";
    }

    public String profileChanger() {
        profile.init();

        return "profile_changer";
    }

    public String back() {
        profile.init();

        return "profile";
    }

    public String getUsersForwardness() {
        return profile.getUsersForwardness();
    }

    public int getUsersAttendance() {
        return profile.getUsersAttendance();
    }

    public String getUsersTrainingDuration() {
        return profile.getUsersTrainingDuration().getLength();
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail() {
        return profile.getEmail();
    }

    public void setEmail(String email) {
        profile.setEmail(email);
    }

    public String getFirstName() {
        return profile.getFirstName();
    }

    public void setFirstName(String firstName) {
        profile.setFirstName(firstName);
    }

    public String getSecondName() {
        return profile.getSecondName();
    }

    public String getPassword() {
        return profile.getPassword();
    }

    public void setPassword(String password) {
        profile.setPassword(password);
    }

    public String getConfirmPassword() {
        return profile.getConfirmPassword();
    }

    public void setConfirmPassword(String confirmPassword) {
        profile.setConfirmPassword(confirmPassword);
    }

    public void setSecondName(String secondName) {
        profile.setSecondName(secondName);
    }

    public Date getDateOfRegistration() {
        return profile.getDateOfRegistration();
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        profile.setDateOfRegistration(dateOfRegistration);
    }

    public String getSomatotype() {
        return profile.getSomatotype();
    }

    public void setSomatotype(String somatotype) {
        profile.setSomatotype(somatotype);
    }

    public String getForwardness() {
        return profile.getForwardness();
    }

    public void setForwardness(String forwardness) {
        profile.setForwardness(forwardness);
    }

    public int getAttendance() {
        return profile.getAttendance();
    }

    public void setAttendance(int attendance) {
        profile.setAttendance(attendance);
    }

    public String getTrainingDuration() {
        return profile.getTrainingDuration().getLength();
    }

    public void setTrainingDuration(String trainingDuration) {
        profile.setTrainingDuration(TrainingDurationEnum.getTrainingDurationEnumFromString(trainingDuration));
    }
    // </editor-fold>
}
