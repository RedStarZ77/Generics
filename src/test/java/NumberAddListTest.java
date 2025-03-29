import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Ex.NumberAddList.addNumber;
import static org.junit.jupiter.api.Assertions.*;

class NumberAddListTest {

    @Test
    void addNumberIntegerTest() {
        List<Integer> list = new ArrayList<>();
        addNumber(list);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), list);
    }

    @Test
    void addNumberNumberTest() {
        List<Number> list = new ArrayList<>();
        addNumber(list);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), list);
    }
}
