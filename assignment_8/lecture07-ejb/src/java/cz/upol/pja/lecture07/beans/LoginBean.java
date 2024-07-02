package cz.upol.pja.lecture07.beans;

import cz.upol.pja.lecture07.api.ActiveSessionInt;
import cz.upol.pja.lecture07.api.LoginInt;
import cz.upol.pja.lecture07.api.UserInt;
import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;

@Stateless
public class LoginBean implements LoginInt {

    @EJB
    private UserInt userInt;

    @EJB
    private ActiveSessionInt activeSession;

    private String loginName;
    private String password;

    @Override
    public String login(String target) {
        User u = userInt.getUser(loginName, userInt.getPasswdHash(password));
        if (u != null) {
            activeSession.setUser(u);
        }
        return target;
    }

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

}
