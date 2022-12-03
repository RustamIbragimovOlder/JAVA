// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Java_PracticalTasks.PT3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PT3_2 {
    public static void main(String[] args) {

        List<Integer> list = randomList();
        System.out.println("Исходный список -> ");
        System.out.println(list);

        List<Integer> result = removingEvenNumbers(list);
    
        System.out.println("Список без четных чисел -> ");
        System.out.println(result);

    }

    // функция создания списка из 20 случайных чисел из диапазона [-50; 50]
    public static List<Integer> randomList () {

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int n = random.nextInt(100) - 50;
            list.add(n);
        }
        return list;
    }

    // функция удаления четных чисел из списка
    public static List<Integer> removingEvenNumbers (List<Integer> list) {
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        
        return list;

    }
}