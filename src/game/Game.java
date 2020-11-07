package game;

import java.util.Random;

public class Game {

    private final int LENGTH_OF_NUMBER = 3;

    public Game() {
    }

    public void start() {
        int[] numbers = generateNumbers(LENGTH_OF_NUMBER);
    }

    int[] generateNumbers(int numberLength) {
        int[] numbers = new int[numberLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = getRandomNumber();
        }
        return numbers;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
