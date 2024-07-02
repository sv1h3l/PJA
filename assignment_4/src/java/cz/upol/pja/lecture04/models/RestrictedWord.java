package cz.upol.pja.lecture04.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "restricted_words")
public class RestrictedWord implements Serializable {

    @Id
    @Column(name = "word")
    private String word;

    public RestrictedWord() {
    }

    public RestrictedWord(String word) {
        this.word = word;
    }

    // <editor-fold defaultstate="collapsed" desc="getters, setters, equals & hashCode ">
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.word);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RestrictedWord other = (RestrictedWord) obj;
        return Objects.equals(this.word, other.word);
    }

    /*@Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this.word != obj) {
            return false;
        }
        return true;
    }*/
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    // </editor-fold>
}
