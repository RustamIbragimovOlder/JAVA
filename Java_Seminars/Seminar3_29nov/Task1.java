// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.

package Java_Seminars.Seminar3_29nov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Var1
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) - 50; // от -50 до 50
            list1.add(num);
        }
        System.out.println((list1));
        Collections.sort(list1);;
        System.out.println((list1));
        
        // Var2
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) - 50; // от -50 до 50
            list2.add(num);
        }

        System.out.println((list2));
        list2.sort(Comparator.naturalOrder());
        System.out.println((list2));

    }
}
