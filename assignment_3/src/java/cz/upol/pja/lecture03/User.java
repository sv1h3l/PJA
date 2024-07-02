
package cz.upol.pja.lecture03;

/**
 * POJO reprezentujici uzivatele
 */
public class User {
    
    private final String loginName;
    private final String passwordHash;
    
    private final String firstName;
    private final String secondName;

    public User(String loginName, String passwordHash, String firstName, String secondName) {
        this.loginName = loginName;
        this.passwordHash = passwordHash;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }  
}
