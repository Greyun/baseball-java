package main.baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberValidatorTest {
    @Test
    @DisplayName("hasNoSameNumberInArray 는 적절한 boolean 값을 반환해야 한다.")
    void hasNoSameNumberInArrayTest() {
        assertTrue(NumberValidator.hasNoSameNumberInArray(new int[]{1, 2, 3}));
        assertFalse(NumberValidator.hasNoSameNumberInArray(new int[]{1, 1, 2}));
        assertFalse(NumberValidator.hasNoSameNumberInArray(new int[]{1, 2, 1}));
        assertFalse(NumberValidator.hasNoSameNumberInArray(new int[]{1, 2, 2}));
        assertFalse(NumberValidator.hasNoSameNumberInArray(new int[]{1, 1, 1}));
    }
}