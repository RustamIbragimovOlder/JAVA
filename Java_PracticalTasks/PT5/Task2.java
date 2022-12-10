// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее.
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

package Java_PracticalTasks.PT5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Сергей");
        names.add("Иван");
        names.add("Пётр");
        names.add("Антон");
        names.add("Иван");
        names.add("Пётр");
        names.add("Иван");
        names.add("Иван");
        names.add("Пётр");
        names.add("Антон");
        names.add("Иван");
        names.add("Пётр");
        names.add("Иван");

        System.out.printf("ArrayList has %d elements \n", names.size());
        for (String person : names) {
            System.out.println(person);
        }

        Map<String, Integer> hashMap = new HashMap<>();
        for (String person : names) {
            String name = person;
            Integer frequency = hashMap.get(name);
            hashMap.put(name, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(hashMap);

        ArrayList<Map.Entry<String, Integer>> mappings = new ArrayList<>(hashMap.entrySet());
        Collections.sort(mappings, Comparator.comparing(Map.Entry::getValue));
        Collections.reverse(mappings);
        Map<String, Integer> linkedHashMapSort = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : mappings) {
            linkedHashMapSort.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedHashMapSort);

    }

}
