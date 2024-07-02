package cz.upol.pja.lecture08.controllers;

import cz.upol.pja.lecture08.models.User;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;

@RequestScoped
@Named("usersCtl")
public class UserController implements Serializable {

    private final EntityManager entityManager = Persistence.createEntityManagerFactory("lecture04PU").createEntityManager();

    private String loginName;

    private String password;
    private String confirmPassword;

    private String firstName;
    private String secondName;

    public UserController() {
    }

    public List<User> getUsers() {
        return (List<User>) entityManager.createQuery("select user from User user").getResultList();
    }
    
        public synchronized User getUser(String loginName, String passwdHash) {
        return getUsers().stream()
                .filter(u -> u.getLoginName().equals(loginName) && u.getPasswordHash().equals(passwdHash))
                .findFirst()
                .orElse(null);
    }

    public String saveForm() {
        entityManager.getTransaction().begin();
        User user = new User(loginName, getPasswdHash(password), firstName, secondName);
        entityManager.persist(user);

        entityManager.getTransaction().commit();
        return "list";
    }

    public String delete(User user) {
        entityManager.getTransaction().begin();
        entityManager.remove(user);
        entityManager.getTransaction().commit();
        return "";
    }

    public static String getPasswdHash(String passwd) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(passwd.getBytes());
            return Base64.getEncoder().encodeToString(md.digest());
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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

    // </editor-fold>
}
