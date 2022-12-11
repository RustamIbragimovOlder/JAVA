package Java_Lectures.Lecture6_9dec;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Example4 {
    public static void main(String[] args) {
        var a = new LinkedHashSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new LinkedHashSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));
        a.add(28);
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
    }

}
