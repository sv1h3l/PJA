package cz.upol.pja.lecture01;

import java.io.Serializable;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class GuessNumber implements Serializable {

    private final int secretValue;
    private final List<Integer> history;
    private GameStatus status;

    public GuessNumber() {
        secretValue = (new Random()).nextInt(1000);
        history = new ArrayList<>();
        status = GameStatus.IN_PROGRESS;
    }

    public int guess(int value) {
        boolean bolSecretValue = false;
        if (history.size() == 9) {
            status = GameStatus.GAME_OVER;
        }
        if (value == secretValue) {
            status = GameStatus.WON;
            bolSecretValue = true;
        }

        System.out.println(secretValue);

        history.add(value);
        CartesianSystem.valuee(history, bolSecretValue);
        return value - secretValue;
    }

    public List<Integer> getHistory() {
        return Collections.unmodifiableList(history);
    }

    public GameStatus getStatus() {
        return status;
    }

    public static enum GameStatus {
        IN_PROGRESS,
        GAME_OVER,
        WON
    }
}
