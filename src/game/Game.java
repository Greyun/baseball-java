package game;

import java.util.Arrays;
import java.util.Random;

public class Game {
    public Game() {
    }

    public void start() {
        Random random = new Random();
        int[] number = {random.nextInt(9) + 1, random.nextInt(9) + 1, random.nextInt(9) + 1};
        System.out.println(Arrays.toString(number));
    }
}
