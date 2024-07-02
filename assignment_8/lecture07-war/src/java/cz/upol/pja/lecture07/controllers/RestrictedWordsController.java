package cz.upol.pja.lecture07.controllers;

import cz.upol.pja.lecture07.api.RestrictedWordsInt;
import cz.upol.pja.lecture07.model.RestrictedWord;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.List;

@ApplicationScoped
@Named("restrictedWords")
public class RestrictedWordsController {

    @EJB
    private RestrictedWordsInt restrictedWordsInt;

    public RestrictedWordsController() {
    }

    public List<RestrictedWord> getWords() {
        return restrictedWordsInt.getWords();
    }

    public String saveForm() {
        restrictedWordsInt.saveForm();
        return "restricted-words";
    }

    public String delete(RestrictedWord word) {
        restrictedWordsInt.delete(word);
        return "";
    }

    public synchronized String getNewWord() {
        return restrictedWordsInt.getNewWord();
    }

    public synchronized void setNewWord(String newWord) {
        restrictedWordsInt.setNewWord(newWord);
    }

    public synchronized boolean checkRestrictedWords(String value) {
        return restrictedWordsInt.checkRestrictedWords(value);
    }

    public synchronized boolean checkRestridtedWordsInString(String value) {
        return restrictedWordsInt.checkRestridtedWordsInString(value);
    }

    public synchronized boolean checkSpaceAndEmptiness(String value) {
        return restrictedWordsInt.checkSpaceAndEmptiness(value);
    }
}
