package interfaces;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.Local;
import java.sql.Date;
import models.enums.TrainingDurationEnum;

/**
 * Tato třída slouží k ovládání procesu úpravy uživatelského profilu a k
 * zobrazování údajů.
 */
@Local
public interface Profile{

    @PostConstruct
    public void init();

    public void change();

    public String getUsersForwardness();

    public int getUsersAttendance();

    public TrainingDurationEnum getUsersTrainingDuration();

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail();

    public void setEmail(String email);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getSecondName();

    public String getPassword();

    public void setPassword(String password);

    public String getConfirmPassword();

    public void setConfirmPassword(String confirmPassword);

    public void setSecondName(String secondName);

    public Date getDateOfRegistration();

    public void setDateOfRegistration(Date dateOfRegistration);

    public String getSomatotype();

    public void setSomatotype(String somatotype);

    public String getForwardness();

    public void setForwardness(String forwardness);

    public int getAttendance();

    public void setAttendance(int attendance);

    public TrainingDurationEnum getTrainingDuration();

    public void setTrainingDuration(TrainingDurationEnum trainingDuration);
    // </editor-fold>
}
