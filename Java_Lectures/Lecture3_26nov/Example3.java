package Java_Lectures.Lecture3_26nov;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.Iterator;


public class Example3 {
    public static void main (String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList list = new ArrayList();
        list.add(2809);
        // list.add("string line");
        for (Object o : list) {
            System.out.println(o); // Проблема извлечения данных
        }
        // например, функционал коллекций:
        // Var 1
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

        // Var 2
        StringBuilder day1 = new StringBuilder("28");
        StringBuilder month1 = new StringBuilder("9");
        StringBuilder year1 = new StringBuilder("1990");
        List<StringBuilder> d1 = Arrays.asList(day1, month1, year1);
        System.out.println(d1);

        // пример Итератора:
        List<Integer> list2 = List.of(1, 12, 123, 1234, 12345);
        
        for (int item : list2) { System.out.println(item); }
        
        Iterator<Integer> col = list2.iterator();
        while (col.hasNext()) {
           System.out.println(col.next());
        //    col.next();
        //    col.remove();
        }


    }
    
}
