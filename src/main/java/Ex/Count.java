package Ex;

import java.util.Collection;

public class Count {

    /**
     * Подсчитывает количество вхождений элемента в коллекции.
     *
     * @param collection Коллекция элементов типа T.
     * @param element    Элемент, количество вхождений которого нужно подсчитать.
     * @return Количество вхождений элемента в коллекции.
     * @throws NullPointerException Если collection == null.
     */

    public static <T> int countOccurrences(Collection<T> collection, T element) {
        if (collection.contains(null)) {
            throw new NullPointerException("Collection must not be null");
        }

        int result = 0;
        for (T arr : collection){
            if (arr.equals(element)){
                result++;
            }
        }
        return result;
    }
}
