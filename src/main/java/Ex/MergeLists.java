package Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MergeLists {

    /**
     * Объединяет два списка в один новый список.
     * Гарантирует:
     * - Не изменяет исходные списки
     * - Поддерживает null-значения в элементах
     * - Оптимизирован по памяти
     *
     * @param list1 Первый список (не null)
     * @param list2 Второй список (не null)
     * @return Новый список, содержащий все элементы из обоих списков
     * @throws NullPointerException если любой из аргументов null
     */

    public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
        Objects.requireNonNull(list1, "First list must not be null");
        Objects.requireNonNull(list2, "Second list must not be null");

        // Создаем список с начальной емкостью = сумма размеров
        List<T> result = new ArrayList<>(list1.size() + list2.size());

        result.addAll(list1);
        result.addAll(list2);

        return result;
    }
}
