// Даны два ArrayList из целых чисел.
// Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй,
// А ТАКЖЕ числа из второй, которых нет в первой

package Java_PracticalTasks.PT3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PT3_4 {
    public static void main (String[] args) {

        List<Integer> listA = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        // System.out.println("listA -> " + Arrays.toString(listA.toArray()));
        System.out.println("listA -> " + listA);

        List<Integer> listB = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7, 8));
        System.out.println("listB -> " + listB);
                
        List<Integer> listE = collectionDifference(listA, listB);
        System.out.println("A - B -> " + listE);
        
        List<Integer> listF = collectionDifference(listB, listA);
        System.out.println("B - A -> " + listF);

        List<Integer> listD = collectionSymmetricDifference(listA, listB);
        System.out.println("A ^ B -> " + listD);
        
        List<Integer> listG = collectionMerging(listA, listB);
        System.out.println("Объединение A и B -> " + listG);
        
        List<Integer> listC = collectionIntersection(listA, listB);
        System.out.println("Пересечение A и B -> " + listC);
    }

    // функция нахождения объединения коллекций
    public static List<Integer> collectionMerging(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(a);
        List<Integer> temp1 = new ArrayList<>(a);
        List<Integer> temp2 = new ArrayList<>(b);
        temp1.retainAll(temp2);
        temp2.removeAll(temp1);
        result.addAll(temp2);
        return result;
    }

    // функция нахождения пересечения коллекций
    public static List<Integer> collectionIntersection(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(a);
        result.retainAll(b);
        return result;
    }

    // функция нахождения разности коллекций
    public static List<Integer> collectionDifference(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>(a);
        result.removeAll(b);
        return result;
    }

    // функция нахождения симметрической разности коллекций
    public static List<Integer> collectionSymmetricDifference(List<Integer> a, List<Integer> b) {
        List<Integer> temp = new ArrayList<>(a);
        List<Integer> result = new ArrayList<>(a);
        temp.retainAll(b);
        result.addAll(b);
        result.removeAll(temp);
        return result;
    }
}


// Вариант со String-ами

// public static void main(String[] args) {

//     List<String> listA = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5"));
//     System.out.println("listA -> " + Arrays.toString(listA.toArray()));

//     List<String> listB = new ArrayList<>(Arrays.asList("3", "4", "5", "6", "7", "8"));
//     System.out.println("listB -> " + Arrays.toString(listB.toArray()));
            
//     Collection<String> listE = collectionDifference(listA, listB);
//     System.out.println("A - B -> " + Arrays.toString(listE.toArray()));
    
//     Collection<String> listF = collectionDifference(listB, listA);
//     System.out.println("B - A -> " + Arrays.toString(listF.toArray()));

//     Collection<String> listD = collectionSymmetricDifference(listA, listB);
//     System.out.println("A ^ B -> " + Arrays.toString(listD.toArray()));
    
//     Collection<String> listG = collectionMerging(listA, listB);
//     System.out.println("Объединение A и B -> " + Arrays.toString(listG.toArray()));
    
//     Collection<String> listC = collectionIntersection(listA, listB);
//     System.out.println("Пересечение A и B -> " + Arrays.toString(listC.toArray()));
// }

// // функция нахождения объединения коллекций
// public static <T> Collection<T> collectionMerging(Collection<T> a, Collection<T> b) {
//     Collection<T> result = new ArrayList<>(a);
//     Collection<T> temp1 = new ArrayList<>(a);
//     Collection<T> temp2 = new ArrayList<>(b);
//     temp1.retainAll(temp2);
//     temp2.removeAll(temp1);
//     result.addAll(temp2);
//     return result;
// }

// // функция нахождения пересечения коллекций
// public static <T> Collection<T> collectionIntersection(Collection<T> a, Collection<T> b) {
//     Collection<T> result = new ArrayList<>(a);
//     result.retainAll(b);
//     return result;
// }

// // функция нахождения разности коллекций
// public static <T> Collection<T> collectionDifference(Collection<T> a, Collection<T> b) {
//     Collection<T> result = new ArrayList<>(a);
//     result.removeAll(b);
//     return result;
// }

// // функция нахождения симметрической разности
// public static <T> Collection<T> collectionSymmetricDifference(Collection<T> a, Collection<T> b) {
//     Collection<T> temp = new ArrayList<>(a);
//     Collection<T> result = new ArrayList<>(a);
//     temp.retainAll(b);
//     result.addAll(b);
//     result.removeAll(temp);
//     return result;
// }
// }