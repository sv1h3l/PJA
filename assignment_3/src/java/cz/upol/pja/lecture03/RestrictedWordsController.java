package cz.upol.pja.lecture03;

import java.util.Collections;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
@Named("restrictedWords")
public class RestrictedWordsController {

    private String newWord;

    private final Set<String> words = new HashSet<>();

    public RestrictedWordsController() {
        words.add("C#");
        words.add("C++");
        words.add("Python");
    }

    public synchronized String getNewWord() {
        return newWord;
    }

    public synchronized void setNewWord(String newWord) {
        this.newWord = newWord;
    }

    public synchronized String addWord() {
        words.add(newWord);
        return "restricted-words";

    }

    public synchronized boolean checkRestrictedWords(String value) {
        return words.stream().anyMatch(u -> u.equals(value));
    }

    public synchronized boolean checkRestridtedWordsInString(String value) {
        String[] parts = value.split(" ");

        for (String part : parts) {
            if(words.stream().anyMatch(u -> u.equals(part)))
            {
                return true;
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

    public synchronized String removeWord(String w) {
        words.remove(w);
        return "restricted-words";
    }

    public synchronized Set<String> getWords() {
        return Collections.unmodifiableSet(new HashSet<>(words));
    }
}
