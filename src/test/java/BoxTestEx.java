import Ex.BoxEx;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxExTest {
    @Test
    void testBoxWithString() {
        BoxEx<String> box = new BoxEx<>();
        box.put("Hello, Generics!");
        assertEquals("Hello, Generics!", box.get());
    }

    @Test
    void testBoxWithInteger() {
        BoxEx<Integer> box = new BoxEx<>();
        box.put(42);
        assertEquals(42, box.get());
    }
}