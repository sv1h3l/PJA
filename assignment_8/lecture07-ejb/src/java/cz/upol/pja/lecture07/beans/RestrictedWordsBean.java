package cz.upol.pja.lecture07.beans;

import cz.upol.pja.lecture07.api.RestrictedWordsInt;
import cz.upol.pja.lecture07.model.RestrictedWord;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class RestrictedWordsBean implements RestrictedWordsInt {

    @PersistenceContext(unitName = "lecture04PU")
    private EntityManager entityManager;

    private String newWord;
    
    @Override
    public List<RestrictedWord> getWords() {
        return (List<RestrictedWord>) entityManager.createQuery("select word from RestrictedWord word").getResultList();
    }

    @Override
    public String saveForm() {
        RestrictedWord word = new RestrictedWord(newWord);
        entityManager.persist(word);
        return "restricted-words";
    }

    @Override
    public void delete(RestrictedWord word) {
        RestrictedWord mergedEntity = entityManager.merge(word);
        entityManager.remove(mergedEntity);
    }

    @Override
    public synchronized boolean checkRestrictedWords(String value) {

        List<RestrictedWord> words = getWords();

        for (RestrictedWord word : words) {
            if (value.equals(word.getWord())) {
                return true;
            }
        }

        return false;
    }

    public synchronized String getNewWord() {
        return newWord;
    }

    public synchronized void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    @Override
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

    @Override
    public synchronized boolean checkSpaceAndEmptiness(String value) {
        if (value.isEmpty() || value.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }
}
