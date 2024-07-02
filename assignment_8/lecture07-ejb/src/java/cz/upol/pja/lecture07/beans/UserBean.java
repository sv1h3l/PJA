package cz.upol.pja.lecture07.beans;

import cz.upol.pja.lecture07.api.UserInt;
import cz.upol.pja.lecture07.model.RestrictedWord;
import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;

@Stateless
public class UserBean implements Serializable, UserInt {

    @PersistenceContext(unitName = "lecture04PU")
    private EntityManager entityManager;

    private String loginName;

    private String password;
    private String confirmPassword;

    private String firstName;
    private String secondName;

    public UserBean() {
        super();
    }

    @Override
    public List<User> getUsers() {
        return (List<User>) entityManager.createQuery("select user from User user").getResultList();
    }

    @Override
    public synchronized User getUser(String loginName, String passwdHash) {
        return getUsers().stream()
                .filter(u -> u.getLoginName().equals(loginName) && u.getPasswordHash().equals(passwdHash))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void saveForm() {
        User user = new User(loginName, getPasswdHash(password), firstName, secondName);
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        User mergedEntity = entityManager.merge(user);
        entityManager.remove(mergedEntity);
    }

    @Override
    public String getPasswdHash(String passwd) {
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
    @Override
    public String getLoginName() {
        return loginName;
    }

    @Override
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    // </editor-fold>
}
