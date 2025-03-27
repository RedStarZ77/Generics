import java.util.ArrayList;
import java.util.List;

public class Basket<T extends Fruit> {

    private List<T> array;

    public Basket() {
        array = new ArrayList<>();
    }

    public float getWeight() {
        float result = 0;
        for (T arr : array) {
            result += arr.getWeight();
        }
        return result;
    }

    public void add(T element) {
        array.add(element);
    }

    public int compare(Basket<?> another) {
        return Float.compare(getWeight(), another.getWeight());
    }

    public static <U extends Fruit> void transfer(Basket<? extends U> src, Basket<? super U> dst) {
        dst.array.addAll(src.array);
        src.array.clear();
    }
}
