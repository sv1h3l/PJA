package cz.upol.pja.lecture07.api;

import jakarta.ejb.Local;

@Local
public interface LoginInt {

    public String login(String target);

    public String getLoginName();

    public void setLoginName(String loginName);

    public String getPassword();

    public void setPassword(String password);
}
