// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
// Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.


package Java_Seminars.Seminar3_29nov;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Меркурий");
        list.add("Венера");
        list.add("Земля");
        list.add("Марс");
        list.add("Сатурн");
        list.add("Юпитер");
        list.add("Нептун");
        list.add("Уран");
        list.add("Плутон");
        list.add("Земля");
        list.add("Юпитер");
        list.add("Марс");
        list.add("Земля");
        list.add("Венера");
        list.add("Меркурий");
        list.add("Марс");

        System.out.println("До сортировки:");
        for (String counter : list) { // печать исходного списка
            System.out.println(counter);
        }
        System.out.println();


        // сортировка Collections
        // Collections.sort(list); // сортировка списка по алфавиту

        // сортировка компаратором
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
            
        });
        
        System.out.println("После сортировки:"); 
        for(String counter : list) { // печать списка после сортировки
            System.out.println(counter);
        }
        System.out.println();

        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            String str = list.get(i);
            if (list.get(i).equals(list.get(i +1))) {
                count++;
            }
            else {
                System.out.println(str + " - " + count);
                count = 1;
            }
        }

        System.out.println(list.get(list.size() - 1) + " - " + count); // добавляем последний элемент списка


        // удалить повторяющиеся элементы
        
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
