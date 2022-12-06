// Пусть дан LinkedList с несколькими элементами.
// Реализуйте метод, который вернет “перевернутый” список.

package Java_PracticalTasks.PT4;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main (String[] args) {
        LinkedList<String> originalList = new LinkedList<>();
        
        originalList.add ("1-12345");
        originalList.add ("2-qwerty");
        originalList.add ("3-examination");
        originalList.add ("4-script ready");
        
        System.out.println(originalList);
        System.out.println(replaselList(originalList));
        
    }

    // функция переворота LinkedList
    public static List<String> replaselList (List<String> inList) {
        
        LinkedList<String> outList = new LinkedList<>();
        for (int i = inList.size() - 1; i >= 0; i--) {
            outList.add(inList.get(i));
        }

        return outList;
    }
}