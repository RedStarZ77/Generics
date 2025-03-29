import Ex.ListCopy;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static Ex.ListCopy.listCopy;
import static org.junit.jupiter.api.Assertions.*;

class ListCopyTest {
    @Test
    void listCopyIntegerTest(){
        List<Integer> list = List.of(1,2,3);
        List<Number> dst = new ArrayList<>();
        listCopy(list, dst);
        assertEquals(dst, list);
    }

    @Test
    void listCopyDoubleTest(){
        List<Double> list = List.of(1.5,2.2,3.3);
        List<Number> dst = new ArrayList<>();
        listCopy(list, dst);
        assertEquals(dst, list);
    }
}