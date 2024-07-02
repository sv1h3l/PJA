package models;

import models.trainingplan.TrainingPlan;
import models.enums.ForwardnessEnum;
import models.enums.TrainingDurationEnum;
import java.sql.Date;

/**
 * Tato třída reprezentuje uživatele aplikace a obsahuje informace o uživateli,
 * jako jsou jeho osobní data, informace o tréninku a plánu cvičení.
 */
public class User {

    private String email;
    private String password;
    private String firstName;
    private String secondName;
    private Date dateOfRegistration;
    private String somatotype;
    private ForwardnessEnum forwardness;
    private int attendance;
    /**
     * Typ String, protože obsahuje pouze nečíselné hodnoty.
     */
    private TrainingDurationEnum trainingDuration;

    private TrainingPlan plan;

    public User(String email, String password, String firstName, String secondName, Date dateOfRegistration, String somatotype, ForwardnessEnum forwardness, int attendance, TrainingDurationEnum trainingDuration) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfRegistration = dateOfRegistration;
        this.somatotype = somatotype;
        this.forwardness = forwardness;
        this.attendance = attendance;
        this.trainingDuration = trainingDuration;
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getSomatotype() {
        return somatotype;
    }

    public void setSomatotype(String somatotype) {
        this.somatotype = somatotype;
    }

    public ForwardnessEnum getForwardness() {
        return forwardness;
    }

    public void setForwardness(ForwardnessEnum forwardness) {
        this.forwardness = forwardness;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public TrainingPlan getPlan() {
        return plan;
    }

    public void setPlan(TrainingPlan plan) {
        this.plan = plan;
    }

    public TrainingDurationEnum getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(TrainingDurationEnum trainingDuration) {
        this.trainingDuration = trainingDuration;
    }

    // </editor-fold>
}
