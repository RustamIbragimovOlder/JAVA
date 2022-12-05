// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.

package Java_Seminars.Seminar4_2dec;

import java.util.ArrayList;
import java.util.LinkedList;


public class Example0 {
    public static void main (String[] args) {
        int repeatCount = 10_000_000; // переменная количество повторов

        long begin = System.nanoTime(); // текущее время в в наносекундах
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < repeatCount; i++) {
            arrayList.add (i);
        }

        long mid = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < repeatCount; i++) {
            linkedList.add (i);
        }

        long end = System.nanoTime();

        System.out.printf("%f %f\n", (mid - begin) / 1e+9, (end - mid) / 1e+9); // / 1e+9 - это перевод в секунды

    }
}