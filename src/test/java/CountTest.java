import org.junit.jupiter.api.Test;

import static Ex.Count.countOccurrences;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class CountTest {

    @Test
    void testStringList() {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange");
        assertEquals(2, countOccurrences(words, "apple"));
    }

    @Test
    void testElementNotInList() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        assertEquals(0, countOccurrences(numbers, 5));
    }
}
