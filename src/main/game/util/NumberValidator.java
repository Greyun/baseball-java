package main.game.util;

public class NumberValidator {
    static boolean hasNoSameNumberInArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            int j = i + 1;
            if (j ==  intArray.length) j = 0;
            if (intArray[i] == intArray[j]) {
                return false;
            }
        }
        return true;
    }
}
