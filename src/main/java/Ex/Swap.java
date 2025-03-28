package Ex;

public class Swap {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
