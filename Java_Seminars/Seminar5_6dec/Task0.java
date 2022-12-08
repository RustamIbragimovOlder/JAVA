// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

package Java_Seminars.Seminar5_6dec;

import java.util.HashMap;
import java.util.Map;

// import javax.swing.text.html.parser.Entity;

public class Task0 {
    public static void main (String[] args) {
        HashMap<Integer, String> passportToLastName = new HashMap<>(); // создали пустой HashMap
        // наполняем коллекцию
        passportToLastName.put (123456, "Иванов"); // используя put помещаем элементы в HashMap
        passportToLastName.put (321456, "Васильев");
        passportToLastName.put (234561, "Петрова");
        passportToLastName.put (234432, "Иванов");
        passportToLastName.put (654321, "Петрова");
        passportToLastName.put (345678, "Иванов");

        System.out.println(passportToLastName);
        
        String lastName = passportToLastName.get(321456); // по ключу найти значение и сохранить в переменную
        System.out.println(lastName);
        
        // функция, если содержит ключ - вывод True, если не содержит - False
        if (passportToLastName.containsKey(321456)) {
            System.out.println("Такой паспорт существует!");
        }
        // или
        System.out.println(passportToLastName.containsKey(321456)); // true
        System.out.println(passportToLastName.containsKey(111111)); // false
        
        // есть функция containsValue, но она не рекомендуется, т.к. словари оптимизированы по ключу!

        for (Map.Entry<Integer, String> entry : passportToLastName.entrySet()) {
            // где Map.Entry<Integer, String> entry - запись, хранящаяся в коллекции
            // passportToLastName.entrySet() - получить набор всех entry
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry);
            }
        }
    }
}