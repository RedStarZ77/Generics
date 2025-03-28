import Ex.Swap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapTest {
    @Test
    void swapSuccessfulSwap() {
        Integer[] array = {1, 2, 3, 4};
        Swap.swap(array, 0, 2);
        assertArrayEquals(new Integer[]{3, 2, 1, 4}, array);
    }

    @Test
    void swapSameIndexesNoChange() {
        String[] array = {"A", "B", "C"};
        Swap.swap(array, 1, 1);
        assertArrayEquals(new String[]{"A", "B", "C"}, array);
    }

    @Test
    void swapNullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Swap.swap(null, 0, 1);
        });
    }

    @Test
    void swapInvalidIndexesThrowsException() {
        Integer[] array = {10, 20, 30};
        assertThrows(IllegalArgumentException.class, () -> {
            Swap.swap(array, -1, 2); // Отрицательный индекс
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Swap.swap(array, 1, 5); // Индекс больше длины массива
        });
    }

    @Test
    void swapDifferentTypesWorksCorrectly() {
        Double[] doubleArray = {1.5, 2.5, 3.5};
        Swap.swap(doubleArray, 0, 2);
        assertArrayEquals(new Double[]{3.5, 2.5, 1.5}, doubleArray);

        String[] strArray = {"Hello", "World"};
        Swap.swap(strArray, 0, 1);
        assertArrayEquals(new String[]{"World", "Hello"}, strArray);
    }
}