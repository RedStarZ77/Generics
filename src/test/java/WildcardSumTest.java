import org.junit.jupiter.api.Test;

import java.util.List;

import static Ex.WildcardSum.sumNumbers;
import static org.junit.jupiter.api.Assertions.*;

class WildcardSumTest {
    @Test
    void testWildcardSum(){
        List<Number> nums = List.of(1, 2.5, 3L);
        double sum = sumNumbers(nums);
        assertEquals(6.5, sum, 0.001);
    }

    @Test
    void testWildcardSumInteger(){
        List<Integer> nums = List.of(5,4,3,2,1);
        double sum = sumNumbers(nums);
        assertEquals(15, sum, 0.001);
    }
}
