// Реализовать алгоритм пирамидальной сортировки (HeapSort).

package Java_PracticalTasks.PT5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main (String[] args) {

        int[] checkArray = randomArray();
        System.out.println("Исходный массив -> ");
        System.out.println(Arrays.toString(checkArray));
        System.out.println("Отсортированный массив -> ");
        heapSort(checkArray, checkArray.length);

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

    public static void heapSort (int[] array, int length) {
        int temp;
        int size = length - 1;
        for (int i = (length / 2); i >= 0; i--) {
            heapify(array, i, size);
        }
        for (int i = size; i >= 0; i--) {
            temp = array[0];
            array[0] = array[size];
            array[size] = temp;
            size--;
            heapify(array, 0, size);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void heapify (int[] array, int top, int heapSize) {
        int left = 2 * top + 1;
        int right = 2 * top + 2;
        int largestElement;
        if (left <= heapSize && array[left] > array[top]) {
            largestElement = left;
        } else {
            largestElement = top;
        }
        if (right <= heapSize && array[right] > array[largestElement]) {
            largestElement = right;
        }
        if (largestElement != top) {
            int temp = array[top];
            array[top] = array[largestElement];
            array[largestElement] = temp;
            heapify(array, largestElement, heapSize);
        }
    }
}
