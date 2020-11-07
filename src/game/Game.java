package game;

import java.util.Random;

public class Game {
    public Game() {
    }

    public void start() {
        int[] numbers = generateNumbers();
    }

    int[] generateNumbers() {
        Random random = new Random();
        return new int[]{random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1};
    }
}
