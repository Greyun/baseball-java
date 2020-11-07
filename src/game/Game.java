package game;

import game.util.NumberGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private final int LENGTH_OF_NUMBER = 3;

    public Game() {
    }

    public void start() {
        int[] computerNumbers = generateNumbers();
        System.out.println(Arrays.toString(computerNumbers));

        System.out.println("연속된 3개의 숫자를 입력하세요. ex) 123");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] userInputArray = userInput.split("");
        int[] userNumber = new int[LENGTH_OF_NUMBER];
        for (int i = 0; i < userInputArray.length; i++) {
            try {
                userNumber[i] = Integer.parseInt(userInputArray[i]);
            } catch (NumberFormatException npe) {
                npe.printStackTrace();
            }
        }
        System.out.println(Arrays.toString(userNumber));
    }

    private int[] generateNumbers() {
        NumberGenerator generator = new NumberGenerator();
        return generator.generateNumbers(LENGTH_OF_NUMBER);
    }
}
