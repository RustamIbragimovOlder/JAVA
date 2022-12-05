// Реализовать консольное приложение, которое в цикле:
// Принимает от пользователя строку вида text~num
// Нужно разделить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Java_Seminars.Seminar4_2dec;

import java.util.Scanner;
import java.util.LinkedList;

public class Example1 {
    public static void main (String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
                
        while (true) {
            System.out.println("Введите текст в виде text~num -> ");
            String input = scanner.nextLine(); // ввод данных от пользователя

            String [] parts = input.split("~"); // разбор строки

            if (parts[0].equals("quit")) { // завершение программы
                break;
            }
            
            if (parts.length < 2) { // проверка на некорректное значение
                System.out.println("Некорректный ввод");
                continue;
            }

            if (parts[0].equals("print")) {
                String removed = linkedList.remove(Integer.parseInt(parts[1]));
                System.out.println(removed);
                System.out.println(linkedList);
                continue;
            }
            else {
                linkedList.add(Integer.parseInt(parts[1]), parts[0]);
                System.out.println(linkedList);
                continue;
            }

        }
        scanner.close(); 
    }
}