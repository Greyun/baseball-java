package main.baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SystemInputGetterTest {
    @Test
    @DisplayName("getIntArrayFromString 은 올바른 정수 배열을 리턴 해야 한다.")
    void should_return_correct_int_array_from_string() {
        SystemInputGetter receiver = new SystemInputGetter();
        int[] intArrayFromString = receiver.getIntArrayFromString("123");
        assertArrayEquals(new int[]{1, 2, 3}, intArrayFromString);
    }
}