import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void testBox() {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Box.transfer(numbers,numbers2);
        assertEquals(10,numbers2.size());
        assertEquals(0,numbers.size());
    }
}
