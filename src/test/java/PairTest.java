import Ex.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {
    @Test
    void pairTest(){
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        assertEquals("Age", pair.getFirst());
        assertEquals(25, pair.getSecond());
    }
}
