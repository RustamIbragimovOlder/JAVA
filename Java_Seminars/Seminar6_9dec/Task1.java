// Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
// Создайте метод, в который передайте заполненный выше массив,
// и с помощью Set вычислите процент уникальных значений в данном массиве,
// и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Java_Seminars.Seminar6_9dec;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class Task1 {
    public static void main (String[] args) {
        
        Integer[] arrayTest = fillArray(1000, 25);
        System.out.println(calcPercentUnicNumbers(arrayTest));
        
    }

    // функция заполнения массива из N элементов случайными числами от 0 до maxRange
    public static Integer[] fillArray (int capacity, int maxRange) {
        
        Integer[] array = new Integer[capacity];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxRange);
        }
        return array;
    }

    // функция вычисления процента уникальных значений в массиве
    public static float calcPercentUnicNumbers (Integer [] array) {

        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(array));
        return set.size() * 100.0f / array.length;

    }
}
