// Реализовать алгоритм сортировки слиянием.

package Java_PracticalTasks.PT3;

import java.util.Arrays;
import java.util.Random;

public class PT3_1 {
    public static void main(String[] args) {

        int[] checkArray = randomArray();
        System.out.println("Исходный массив -> ");
        System.out.println(Arrays.toString(checkArray));
        int[] sortArray = mergeSort(checkArray);
        System.out.println("Отсортированный массив -> ");
        System.out.println(Arrays.toString(sortArray));

    }

    // функция создания массива из 20 случайных чисел из диапазона [-50; 50]
    public static int[] randomArray() {
        int[] arr = new int[20];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(100) - 50;
            arr[i] = n;
        }
        return arr;
    }

    // функция соединения
    public static int[] mergeSort(int[] checkArray) {
        int[] buffer1 = Arrays.copyOf(checkArray, checkArray.length);
        int[] buffer2 = new int[checkArray.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, checkArray.length);
        return result;
    }

    // функция сортировки
    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        // слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
