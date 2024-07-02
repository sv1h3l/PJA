package beans;

import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.sql.Date;
import models.enums.ForwardnessEnum;
import models.User;
import interfaces.ActiveSession;
import interfaces.Database;
import interfaces.Profile;
import models.enums.TrainingDurationEnum;

/**
 * Tato třída slouží k ovládání procesu úpravy uživatelského profilu a k
 * zobrazování údajů.
 */
@Stateless
public class ProfileBean implements Profile {

    @EJB
    private ActiveSession activeSessionBean;

    @EJB
    private Database databaseBean;

    private String email;
    private String firstName;
    private String secondName;
    private Date dateOfRegistration;
    private String somatotype;
    private String forwardness;
    private int attendance;
    private TrainingDurationEnum trainingDuration;
    private String password;
    private String confirmPassword;

    public ProfileBean() {
    }

    @PostConstruct
    public void init() {
        if (activeSessionBean.isUserLoggedIn()) {
            User user = activeSessionBean.getUser();
            this.email = user.getEmail();
            this.firstName = user.getFirstName();
            this.secondName = user.getSecondName();
            this.dateOfRegistration = user.getDateOfRegistration();
            this.somatotype = user.getSomatotype();
            this.forwardness = user.getForwardness().getDifficulty();
            this.attendance = user.getAttendance();
            this.trainingDuration = user.getTrainingDuration();
            this.password = user.getPassword();
            this.confirmPassword = user.getPassword();
        }
    }

    public void change() {
        User user;

        if (password.isEmpty()) {
            user = databaseBean.updateUser(email, firstName, secondName, dateOfRegistration, somatotype, ForwardnessEnum.getForwardnessEnumFromString(forwardness), attendance, trainingDuration, activeSessionBean.getUser().getPassword());
            activeSessionBean.setUser(user);
        } else {
            user = databaseBean.updateUserAndPassword(email, firstName, secondName, dateOfRegistration, somatotype, ForwardnessEnum.getForwardnessEnumFromString(forwardness), attendance, trainingDuration, password);
            activeSessionBean.setUser(user);
        }
    }

    public String getUsersForwardness() {
        return activeSessionBean.getUser().getForwardness().getDifficulty();
    }

    public int getUsersAttendance() {
        return activeSessionBean.getUser().getAttendance();
    }

    public TrainingDurationEnum getUsersTrainingDuration() {
        return activeSessionBean.getUser().getTrainingDuration();
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public TrainingDurationEnum getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(TrainingDurationEnum trainingDuration) {
        this.trainingDuration = trainingDuration;
    }
    // </editor-fold>
}
