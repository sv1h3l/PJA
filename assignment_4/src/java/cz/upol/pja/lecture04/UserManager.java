
package cz.upol.pja.lecture04;

import cz.upol.pja.lecture04.models.User;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

/**
 * Jednoducha in-memory databaze uzivatelu
 */
@ApplicationScoped
@Named("userManager")
public class UserManager {
    
    private final List<User> users = new ArrayList<>();
    
    public UserManager() {
        users.add(new User("alice", getPasswdHash("a"), "Alice", "A."));
        users.add(new User("bob",   getPasswdHash("b"), "Bob",   "B."));
        users.add(new User("c", getPasswdHash("c"), "Chuck", "N."));
    }
    
    /**
     * Prida noveho uzivatele do db
     */
    public synchronized void addUser(User user) {
        users.add(user);
    }
    
    /**
     * Odstrani prislusneho uzivatele z db
     */
    public synchronized String removeUser(User u) {
        users.remove(u);
        return "list";
    }
    
    /**
     * Pro dany login a hash hesla vraci odpovidajici objekt s uzivatelem.
     * Pokud uzivatele neexistuje, vraci null;
     */
    public synchronized User getUser(String loginName, String passwdHash) {
        return users.stream()
                .filter(u -> u.getLoginName().equals(loginName) && u.getPasswordHash().equals(passwdHash))
                .findFirst()
                .orElse(null);
    }
    
    /**
     * Vraci true, pokud uzivatel s danym loginem existuje
     */
    public synchronized boolean existsUser(String loginName) {
        return users.stream().anyMatch(u -> u.getLoginName().equals(loginName));
    }
    
    /**
     * Vraci seznam uzivatelu v databazi
     */
    public synchronized List<User> getUsers() {
        return Collections.unmodifiableList(new ArrayList<>(users));
    }
    
    /**
     * Pro zadane heslo spocita hash a vraci jeho textovou reprezentaci
     */
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
}
