package game;

import game.util.NumberGenerator;

public class Game {

    private final int LENGTH_OF_NUMBER = 3;

    public Game() {
    }

    public void start() {
        NumberGenerator generator = new NumberGenerator();
        int[] numbers = generator.generateNumbers(LENGTH_OF_NUMBER);
    }
}
