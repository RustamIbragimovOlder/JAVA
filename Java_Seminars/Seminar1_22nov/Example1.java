// Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
// В консоли запросить имя пользователя.
// В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalDateTime;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "CP866");
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        System.out.println();
        LocalDateTime now = LocalDateTime.now ();
        if (now.getHour() < 12 &&  now.getHour() >= 5) {
            System.out.printf("Доброе утро, %s!", name);
            System.out.println();
        }
        else if (now.getHour() < 18 &&  now.getHour() >= 12) {
            System.out.printf("Добрый день, %s!", name);
            System.out.println();
        }
        else if (now.getHour() < 23 &&  now.getHour() >= 18) {
            System.out.printf("Добрый вечер, %s!", name);
            System.out.println();
        }
        else if (now.getHour() < 5 &&  now.getHour() >= 23) {
            System.out.printf("Доброй ночи, %s!", name);
            System.out.println();
        }
        iScanner.close();
    }
}
