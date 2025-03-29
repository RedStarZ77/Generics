package Ex;

import java.util.List;

public class NumberAddList {
    public static void addNumber(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }
}
