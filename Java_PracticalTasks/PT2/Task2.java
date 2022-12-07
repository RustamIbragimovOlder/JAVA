// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

package Java_PracticalTasks.PT2;

// import java.io.FileWriter;
// import java.io.IOException;
// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
// import java.util.logging.Logger;
// import java.util.*;


// 1. Мой вариант

// public class Task2 {
//     public static void main(String[] args) {
//         int [] checkArray = { 9, 3, 5, 8, 7, 0, 4, 2, 1, 6 };
//         // вызов функции
//         printMas(checkArray);
//         System.out.println();
//         bubbleSort(checkArray);
//         printMas(checkArray);
//         System.out.println();
//     }

//     // функция вывода массива в консоль
//     public static void printMas (int[] mas) {
//         for (int i = 0; i < mas.length; i++){
//             System.out.print(mas[i]);
//             if(i < mas.length - 1) {
//                 System.out.print(", ");
//             }
//         }
//     }

//     // функция сортировки пузырьком и записи итераций в файл
//     public static void bubbleSort (int[] mas) {
//         boolean isSorted = false;
//         int temp;
//         while(!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < mas.length - 1; i++) {
//                 if (mas[i] > mas[i+1]) {
//                     isSorted = false;
//                     temp = mas[i];
//                     mas[i] = mas[i+1];
//                     mas[i+1] = temp;

//                     String str = Arrays.toString(mas);
//                     try (FileWriter fw = new FileWriter("log_filePT2_2.txt", true)) {
//                         fw.write(str);            
//                         fw.append('\n');
//                         fw.flush();
//                     } catch (IOException ex) {
//                         System.out.println(ex.getMessage());
//                     }
//                 }
//             }
//         }
//     }
// }


// Вариант преподавателя
public class Task2 {
    public static void main (String[] args) {
        int [] checkArray = { 9, 3, 5, 8, 7, 0, 4, 2, 1, 6 };
        System.out.println(Arrays.toString(checkArray));
        System.out.println();
        // вызов функции
        bubbleSort(checkArray);
        System.out.println(Arrays.toString(checkArray));
        System.out.println();
    }

    // функция сортировки пузырьком и записи итераций в файл
    private static void bubbleSort (int[] mas) {
        Logger logger = Logger.getLogger(Task2.class.getName ());
        
        boolean isSorted = false;
        int temp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                logger.log(Level.INFO, String.format("i = %d", i));
                logger.log(Level.INFO, String.format("need to swap? = %d", mas[i] > mas[i+1] ? 1 : 0));
                if (mas[i] > mas[i+1]) {
                    isSorted = false;
                    temp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = temp;
                    logger.log(Level.INFO, Arrays.toString(mas));

                    
                }
            }
        }
    }
}