package cz.upol.pja.lecture07.api;

import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.Local;
import java.util.List;

@Local
public interface UserInt {

    public List<User> getUsers();

    public User getUser(String loginName, String passwdHash);

    public void saveForm();

    public void delete(User user);

    public String getPasswdHash(String passwd);

    // <editor-fold defaultstate="collapsed" desc="getters & setters">
    public String getLoginName();

    public void setLoginName(String loginName);

    public String getPassword();

    public void setPassword(String password);

    public String getConfirmPassword();

    public void setConfirmPassword(String confirmPassword);

    public String getFirstName();

    public void setFirstName(String firstName);

    public String getSecondName();

    public void setSecondName(String secondName);

    // </editor-fold>
}
