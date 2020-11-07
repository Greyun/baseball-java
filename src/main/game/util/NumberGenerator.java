package main.game.util;

import java.util.Random;

public class NumberGenerator {
    public int[] generateNumbers(int numberLength) {
        int[] numbers = new int[numberLength];
        do {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = getRandomNumber();
            }
        } while (!NumberValidator.hasNoSameNumberInArray(numbers));
        return numbers;
    }

    private int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }
}
