package main.game.util;

import java.util.Scanner;

public class UserInputReceiver {
    public int[] receiveNumbersFromUser() {
        return getIntArrayFromString(getUserInput());
    }

    private int[] getIntArrayFromString(String userInput) {
        String[] userInputArray = userInput.split("");
        int[] userNumbers = new int[userInputArray.length];
        for (int i = 0; i < userInputArray.length; i++) {
            userNumbers[i] = Integer.parseInt(userInputArray[i]);
        }
        return userNumbers;
    }

    private String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
