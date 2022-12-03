// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметичское этого списка.

package Java_PracticalTasks.PT3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PT3_3 {
    public static void main(String[] args) {

        List<Integer> list = randomList();
        System.out.println("Исходный список -> " + list);

        // Через встроенные функции
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));

        // Через алгоритм
        int min = list.get(0);
        for (int i : list) {
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Min = %d\n", min);

        int max = list.get(0);
        for (int i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.printf("Max = %d\n", max);

        double sum = 0;
        for (int i : list) {
            sum += i;
        }
        double avg = sum / list.size();
        System.out.printf("AVG = %.2f\n", avg);
    }

    // функция создания списка из 20 случайных чисел из диапазона [-10; 10]
    public static List<Integer> randomList() {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int n = random.nextInt(20) - 10;
            list.add(n);
        }
        return list;
    }
}