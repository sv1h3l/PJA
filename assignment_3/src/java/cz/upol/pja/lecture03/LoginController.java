
package cz.upol.pja.lecture03;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * Controller pro komponentu pja:login
 */
@RequestScoped
@Named("loginController")
public class LoginController {
    
    @Inject private UserManager userManager;
    @Inject private ActiveSession session;
    
    private String loginName;
    private String password;

    /**
     * Overi, zda uzivatel s danym loginem a heslem se muze prihlasti
     * @param target -- cil, kam ma byt uzivatel presmerovan po prihlaseni
     */
    public String login(String target) {
        User u = userManager.getUser(loginName, UserManager.getPasswdHash(password));
        if (u != null) session.setUser(u);
        return target;
    }

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

}
