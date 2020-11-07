package main.game.util;

public class NumberValidator {
    static boolean hasNoSameNumberInArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                if (i == j) continue;
                if (intArray[i] == intArray[j]) return false;
            }
        }
        return true;
    }
}
