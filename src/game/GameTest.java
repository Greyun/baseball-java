package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {
    private final int LENGTH_OF_NUMBER = 3;

    @Test
    @DisplayName("generateNumbers 가 적절한 번호를 리턴 해야 한다.")
    void generateNumbersTest() {
        should_return_3length_intArray_in_generateNumbers();
        should_return_number_between_1_and_9_in_generateNumbers();
    }

    @DisplayName("generateNumbers 로 생성된 번호는 3자리 여야 한다.")
    void should_return_3length_intArray_in_generateNumbers() {
        Game game = new Game();
        int[] numbers = game.generateNumbers(LENGTH_OF_NUMBER);
        assertEquals(3, numbers.length);
    }

    @DisplayName("generateNumbers 로 생성된 번호는 1과 9 사이의 숫자 여야 한다.")
    void should_return_number_between_1_and_9_in_generateNumbers() {
        Game game = new Game();
        int number = game.generateNumbers(LENGTH_OF_NUMBER)[0];
        assertTrue(number >= 1 && number <= 9);
    }
}