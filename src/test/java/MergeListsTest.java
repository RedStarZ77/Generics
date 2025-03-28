import Ex.MergeLists;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class MergeListsTest {
    @Test
    void testMergeNonEmptyLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5);

        List<Integer> merged = MergeLists.mergeLists(list1, list2);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5), merged);
    }

    @Test
    void testMergeWithEmptyList() {
        List<String> list1 = Arrays.asList("a", "b");
        List<String> list2 = Collections.emptyList();

        List<String> merged = MergeLists.mergeLists(list1, list2);

        assertEquals(Arrays.asList("a", "b"), merged);
    }

    @Test
    void testMergeLinkedLists() {
        List<String> linked1 = new LinkedList<>(List.of("a", "b"));
        List<String> linked2 = new LinkedList<>(List.of("c", "d"));

        List<String> merged = MergeLists.mergeLists(linked1, linked2);

        assertEquals(List.of("a", "b", "c", "d"), merged);
    }
}
