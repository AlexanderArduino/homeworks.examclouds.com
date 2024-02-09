package JavaProgramming.Homework.Lesson7.Lection.BubbleAlgoritm;

import java.util.Arrays;

public class BubbleAlgoritm {

    public static int[] bubble(int[] massive) {
        int temp = 0;
        for (int j = 0; j < massive.length; j++) {
            for (int i = 0; i < massive.length - 1; i++) {
                if (massive[i + 1] < massive[i]) {
                    temp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = temp;
                }
            }
        }
        return massive;
    }

    /**
     * Линейный поиск
     * Самый простой, но и самый долгий алгоритм. Перебираем элементы массива и сравниваем
     * с elementToSearch, который мы должны найти.
     *
     * @param array           - массив для поиска элемента
     * @param elementToSearch - элемент, который надо найти
     * @return значение индекса массива по которому находится число. если числа нет в массиве - возвратит -1;
     */
    public static int linearySearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Метод работает только на отсортированном массиве.
     * Возвращает индекс, по которому в массиве расположен искомый элемент, или -1 если элемента в массиве нет
     * @param array - массив для поиска (должен быть отсортирован)
     * @param elementToSearch - элемент, котрый ищем
     * @return - возвращает индекс или -1 если элемент не найден
     */
    public static int binaryIterative(int[] array, int elementToSearch) {
        Arrays.sort(array);
        System.out.println("Sorting: " + Arrays.toString(array));
        int firstIndex = 0;
        int lastindex = array.length - 1;

        while (firstIndex <= lastindex) {
            int middleIndex = (firstIndex + lastindex) / 2;
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (array[middleIndex] > elementToSearch) {
                firstIndex = middleIndex - 1;
            } else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}

class Test {

    public static void main(String[] args) {
        int[] mas = {0, 5, 4, 3, 45, 5, 6, 7, 5, 34, 2, 1, 32, 4, 54, 56, 7, 785, 32, 12, 3, 324, 5, 65};
        System.out.println(BubbleAlgoritm.binaryIterative(mas, 324));

//        System.out.println(Arrays.toString(BubbleAlgoritm.bubble(mas)));
    }
}
