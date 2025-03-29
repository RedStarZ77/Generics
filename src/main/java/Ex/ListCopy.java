package Ex;

import java.util.List;

public class ListCopy {
    public static <T> void listCopy(List<? extends T> src, List<? super T> dst){
        dst.addAll(src);
    }
}
