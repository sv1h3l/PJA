package cz.upol.pja.lecture05.controllers;

import cz.upol.pja.lecture05.models.RestrictedWord;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.util.List;

@ApplicationScoped
@Named("restrictedWords")
public class RestrictedWordsController {

    private final EntityManager entityManager = Persistence.createEntityManagerFactory("lecture04PU").createEntityManager();

    private String newWord;

    public RestrictedWordsController() {
    }

    public List<RestrictedWord> getWords() {
        return (List<RestrictedWord>) entityManager.createQuery("select word from RestrictedWord word").getResultList();
    }

    public String saveForm() {
        entityManager.getTransaction().begin();
        RestrictedWord word = new RestrictedWord(newWord);
        entityManager.persist(word);
        entityManager.getTransaction().commit();
        return "restricted-words";
    }

    public String delete(RestrictedWord word) {
        entityManager.getTransaction().begin();
        // odstraneni objektu z databaze
        entityManager.remove(word);
        entityManager.getTransaction().commit();
        return "";
    }

    public synchronized String getNewWord() {
        return newWord;
    }

    public synchronized void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    public synchronized boolean checkRestrictedWords(String value) {

        List<RestrictedWord> words = getWords();

        for (RestrictedWord word : words) {
            if (value.equals(word.getWord())) {
                return true;
            }
        }

        return false;
    }

    public synchronized boolean checkRestridtedWordsInString(String value) {
        String[] parts = value.split(" ");
        List<RestrictedWord> words = getWords();

        for (String part : parts) {
            for (RestrictedWord word : words) {
                if (part.equals(word.getWord())) {
                    return true;
                }
            }
        }
        return false;
    }

    public synchronized boolean checkSpaceAndEmptiness(String value) {
        if (value.isEmpty() || value.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }
}
