package beans;

import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.util.Date;
import interfaces.Database;
import interfaces.Register;

/**
 * Třída sloužící k ovládání procesu registrace uživatele.
 */
@Stateless
public class RegisterBean implements Register {

    @EJB
    private Database databaseBean;

    private String email;
    private String password;
    private String confirmPassword;
    private String firstName;
    private String secondName;
    private Date dateOfRegistration;
    private String somatotype;
    private String forwardness;
    private int attendance;
    private String trainingDuration;

    public RegisterBean() {
    }

    public void back() {
        email = new String();
        password = new String();
        confirmPassword = new String();
        firstName = new String();
        secondName = new String();
        somatotype = new String();
        forwardness = new String();
        attendance = 0;
        trainingDuration = new String();
    }

    public void register() {
        databaseBean.addUser(email, firstName, secondName, somatotype, forwardness, attendance, trainingDuration, password);
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public String getForwardness() {
        return forwardness;
    }

    public void setForwardness(String forwardness) {
        this.forwardness = forwardness;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(String trainingDuration) {
        this.trainingDuration = trainingDuration;
    }

    // </editor-fold>
}
