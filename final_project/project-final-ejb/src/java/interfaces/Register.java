package interfaces;

import jakarta.ejb.Local;
import java.util.Date;

/**
 * Třída sloužící k ovládání procesu registrace uživatele.
 */
@Local
public interface Register {

    public void back();

    public void register();

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail();

    public void setEmail(String email);

    public String getPassword();

    public void setPassword(String password);

    public String getConfirmPassword();

    public void setConfirmPassword(String confirmPassword);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getSecondName();

    public void setSecondName(String secondName);

    public Date getDateOfRegistration();

    public void setDateOfRegistration(Date dateOfRegistration);

    public String getSomatotype();

    public void setSomatotype(String somatotype);

    public String getForwardness();

    public void setForwardness(String forwardness);

    public int getAttendance();

    public void setAttendance(int attendance);

    public String getTrainingDuration();

    public void setTrainingDuration(String trainingDuration);

    // </editor-fold>
}
