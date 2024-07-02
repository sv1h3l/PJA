package cz.upol.pja.lecture02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;


@Named("gameApp")
@ApplicationScoped
public class GuessWordApp implements java.io.Serializable {

    private final String INPUT_TEXT = "Lorem ipsum dolor sit amet consectetur adipiscing elit maecenas vitae facilisis nulla morbi mollis ultricies leo at placerat praesent luctus ac est vitae sodales donec vitae scelerisque ipsum fusce accumsan elit sed lorem fermentum vel hendrerit justo luctus sed sit amet metus et risus fringilla cursus non eu nisi";
    private final List<String> words;
    private int gameCount = 0;
    
    public GuessWordApp(){
        words = Arrays.asList(INPUT_TEXT.toLowerCase().split(" "));
    }
    
    /**
     * Vraci seznam slov pouzitelnych ve hre
     */
    public List<String> getWords() {
        return Collections.unmodifiableList(words);
    }

    // pocet her muze byt zvysovan z vice vlaken soucasne,
    // proto musi byt metody jako synchronized
    public synchronized int getGameCount() {
        return gameCount;
    }

    public synchronized void incGameCount() {
        this.gameCount++;
    }
}
