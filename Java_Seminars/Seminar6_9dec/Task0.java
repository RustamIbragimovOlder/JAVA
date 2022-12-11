// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
// Распечатайте содержимое данного множества.


package Java_Seminars.Seminar6_9dec;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Task0 {
    public static void main (String[] args) {
        
        System.out.println(new HashSet<> (Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3)));

        System.out.println(new LinkedHashSet<> (Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3)));

        System.out.println(new TreeSet<> (Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3)));
        
    }
    
}
