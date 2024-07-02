package cz.upol.pja.lecture02;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@Named("gameController")
@RequestScoped
public class GameController {

    // provede automaticke provazani s prislousnou session-bean
    @Inject
    private Game game;

    // hodnota vstupniho pole
    private String inputChar;

    public GameController() {
    }

    /**
     * Zahaji novou hru
     */
    public String startNewGame() {
        game.initializeGame();

        // prejde na stranku game-page
        return "game-page";
    }

    /**
     * Akce, ktera je vyvolana, pokud se uzivatel pokusil uhadnout jeden znak
     *
     * @return stranku, kterou se ma pokracovat
     */
    public String guess() {
        game.addCharacter(inputChar.charAt(0));
        inputChar = "";

        if (game.getActualNumberOfAttemps() >= game.getMaxNumberOfAttemps()-1) {
            // prejde na stranku loose
            return "loose";
        } else if (game.getCharacters().contains('?')) {
            game.incActualNumberOfAttemps();
            // pokracuje ve hre
            return "game-page";
        } else {
            // prejde na stranku win
            return "win";
        }
    }

    //
    // gettery & settery
    //
    public String getInputChar() {
        return inputChar;
    }

    public void setInputChar(String inputChar) {
        this.inputChar = inputChar;
    }
}
