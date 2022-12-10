// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что один человек может иметь несколько телефонов.

package Java_PracticalTasks.PT5;

import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {
    public static void main (String[] args) {

        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();
        
        // заполняем phoneBook
        ArrayList<String> phoneSet1 = new ArrayList<>();
        phoneSet1.add("mobil1 +7 123 111");
        phoneSet1.add("mobil2 +7 123 222");
        phoneSet1.add("work1 +7 234 111");
        phoneSet1.add("home1 +7 345 111");
        phoneBook.putIfAbsent("Иванов Иван Иванович", phoneSet1);
        
        ArrayList<String> phoneSet2 = new ArrayList<>();
        phoneSet2.add("mobil1 +7 456 111");
        phoneSet2.add("mobil2 +7 456 222");
        phoneSet2.add("work1 +7 567 111");
        phoneSet2.add("work2 +7 567 222");
        phoneSet2.add("home1 +7 678 111");
        phoneBook.putIfAbsent("Петров Петр Петрович", phoneSet2);

        ArrayList<String> phoneSet3 = new ArrayList<>();
        phoneSet3.add("mobil1 +7 789 111");
        phoneSet3.add("mobil2 +7 789 222");
        phoneSet3.add("work1 +7 890 111");
        phoneSet3.add("work2 +7 890 222");
        phoneSet3.add("home1 +7 901 111");
        phoneSet3.add("home1 +7 901 111");
        phoneBook.putIfAbsent("Сидоров Сидор Сидорович", phoneSet3);

        // вывод всей телефонной книги
        System.out.println("Вывод всей телефонной книги: ");
        for (HashMap.Entry<String, ArrayList<String>> item : phoneBook.entrySet()) {
            Object[] temp = item.getValue().toArray();
            for (Object phone : temp) {
                System.out.printf("Абонент %s телефон %s \n", item.getKey(), phone);

            }
        }

        // вывод данных конкретного абонента
        System.out.println("Вывод данных Петрова: ");
        for (HashMap.Entry<String,  ArrayList<String>> subscriber : phoneBook.entrySet()) {
            if (subscriber.getKey().equals("Петров Петр Петрович")) {
                Object[] temp = subscriber.getValue().toArray();
                for (Object phone : temp) {
                    System.out.printf("Абонент %s телефон %s \n", subscriber.getKey(), phone);
                }
            } 
        }

    }
}