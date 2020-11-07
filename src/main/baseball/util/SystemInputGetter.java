package main.baseball.util;

import java.util.Scanner;

public class SystemInputGetter {
    public static int[] getNumbersFromSystemInput(SystemInputGetter systemInputGetter) {
        int[] intArrayFromString;
        while (true) {
            System.out.println("3자리의 숫자를 입력하세요. ex) 123");
            System.out.println("연속된 숫자는 허용되지 않습니다. ex) 112");

            String userInput = systemInputGetter.getUserInput();
            try {
                intArrayFromString = systemInputGetter.getIntArrayFromString(userInput);
            } catch (NumberFormatException npe) {
                System.out.println(userInput + "은(는) 올바르지 않은 숫자입니다. 숫자를 정확하게 입력해주세요.\n");
                continue;
            }

            if (NumberValidator.hasNoSameNumberInArray(intArrayFromString)) break;
            System.out.println("연속된 숫자가 발견되었습니다. 숫자를 정확하게 입력해주세요.\n");
        }
        return intArrayFromString;
    }

    public String getExitOptionFromSystemInput() {
        String userInput;
        while (true) {
            System.out.println("다시 하시겠습니다? (Y: 다시하기 / N: 종료하기)");

            userInput = getUserInput();
            if (isOptionString(userInput)) break;

            System.out.println(userInput + "은(는) 올바르지 않은 옵션입니다. 옵션을 정확하게 입력해주세요.\n");
        }
        return userInput;
    }

    private boolean isOptionString(String userInput) {
        return "Y".equalsIgnoreCase(userInput) || "N".equalsIgnoreCase(userInput);
    }

    int[] getIntArrayFromString(String userInput) throws NumberFormatException {
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
