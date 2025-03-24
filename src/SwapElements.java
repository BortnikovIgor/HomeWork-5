public class SwapElements {

    // Метод для обмена элементов массива
    public static <T> void swap(T[] array, int i, int j) {
        // Можно добавить проверку корректности:
        if (array == null) {
            throw new IllegalArgumentException("Массив не должен быть null");
        }
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы массива");
        }

        // Обмен элементов
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Метод main для демонстрации работы метода swap
    public static void main(String[] args) {
        // Пример с массивом строк
        String[] words = {"apple", "banana", "orange", "kiwi"};
        System.out.println("До обмена: " + java.util.Arrays.toString(words));
        swap(words, 1, 3);
        System.out.println("После обмена: " + java.util.Arrays.toString(words));

        // Пример с массивом чисел
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println("До обмена: " + java.util.Arrays.toString(numbers));
        swap(numbers, 0, 4);
        System.out.println("После обмена: " + java.util.Arrays.toString(numbers));
    }
}
