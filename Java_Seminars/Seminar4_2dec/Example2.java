// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
// Если введено revert, удаляет предыдущую введенную строку из памяти.

package Java_Seminars.Seminar4_2dec;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;


public class Example2 {
    public static void main (String[] args) {
        Deque<String> stack = new LinkedList<>(); // Deque - двусторонняя очередь
        Scanner scanner = new Scanner(System.in);
        
        while (true) { // бесконечный цикл
            System.out.println("Введите строку -> ");
            String input = scanner.nextLine(); // ввод данных от пользователя
            
            if (input.equals("quit")) { // условие прекращения бесконечного цикла
                break;
            }

            else if (input.equals("print")) { // если print, выводит строки в обратном порядке
                System.out.println(stack);
            }

            else if (input.equals("revert")) { // если revert, удаляет предыдущую введенную строку
                System.out.println(stack.removeLast());
                // System.out.println(stack.pollFirst());
            }
            
            else {
                stack.addFirst(input);
            }
            
            System.out.println(stack);

        }
        scanner.close(); 
    }
}
