// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.


package Java_Seminars.Seminar3_29nov;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("25");
        list.add("123");
        list.add("world");
        list.add("456");
        list.add("hello");
        list.add("789");
        list.add("world");
        list.add("68");

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);       
    }
}
