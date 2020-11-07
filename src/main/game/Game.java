package main.game;

import main.game.util.NumberGenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    private final int LENGTH_OF_NUMBER = 3;

    public Game() {
    }

    public void start() {
        int[] computerNumbers = generateNumbers();
        System.out.println(Arrays.toString(computerNumbers));

        int[] userNumbers = receiveNumbersFromUser();
        System.out.println(Arrays.toString(userNumbers));
    }

    private int[] receiveNumbersFromUser() {
        System.out.println("연속된 3개의 숫자를 입력하세요. ex) 123");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] userInputArray = userInput.split("");
        int[] userNumbers = new int[LENGTH_OF_NUMBER];
        for (int i = 0; i < userInputArray.length; i++) {
            try {
                userNumbers[i] = Integer.parseInt(userInputArray[i]);
            } catch (NumberFormatException npe) {
                npe.printStackTrace();
            }
        }
        return userNumbers;
    }

    private int[] generateNumbers() {
        NumberGenerator generator = new NumberGenerator();
        return generator.generateNumbers(LENGTH_OF_NUMBER);
    }
}
