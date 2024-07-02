package cz.upol.pja.lecture07.api;

import cz.upol.pja.lecture07.model.RestrictedWord;
import jakarta.ejb.Local;
import java.util.List;

@Local
public interface RestrictedWordsInt {

    public List<RestrictedWord> getWords();

    public String saveForm();

    public void delete(RestrictedWord word);

    public boolean checkRestrictedWords(String value);

    public boolean checkRestridtedWordsInString(String value);

    public boolean checkSpaceAndEmptiness(String value);

    public String getNewWord();

    public void setNewWord(String newWord);
}
