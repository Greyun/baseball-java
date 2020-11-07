package main.game.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {
    private final int LENGTH_OF_NUMBER = 3;
    private final NumberGenerator numberGenerator = new NumberGenerator();

    @Test
    @DisplayName("generateNumbers 가 적절한 번호를 리턴 해야 한다.")
    void generateNumbersTest() {
        should_return_3length_intArray_in_generateNumbers();
        should_return_number_between_1_and_9_in_generateNumbers();
        should_not_have_same_number_in_result_array();
    }

    @DisplayName("generateNumbers 로 생성된 번호는 3자리 여야 한다.")
    void should_return_3length_intArray_in_generateNumbers() {
        int[] numbers = numberGenerator.generateNumbers(LENGTH_OF_NUMBER);
        assertEquals(3, numbers.length);
    }

    @DisplayName("generateNumbers 로 생성된 번호는 1과 9 사이의 숫자 여야 한다.")
    void should_return_number_between_1_and_9_in_generateNumbers() {
        int number = numberGenerator.generateNumbers(LENGTH_OF_NUMBER)[0];
        assertTrue(number >= 1 && number <= 9);
    }

    @DisplayName("generateNumbers 로 생성된 번호는 동일한 숫자를 포함하지 않아야 한다.")
    void should_not_have_same_number_in_result_array() {
        for (int i = 0; i < 100; i++) {
            int[] numbers = numberGenerator.generateNumbers(LENGTH_OF_NUMBER);
            hasNoSameNumberInArray(numbers);
        }
    }

    private void hasNoSameNumberInArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) continue;
                assertNotEquals(numbers[i], numbers[j]);
            }
        }
    }
}