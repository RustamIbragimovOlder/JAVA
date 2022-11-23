// Настроить проект,
// вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Hello {
    public static void main (String[] args) {
        System.out.println ("Hello, world!");

        LocalDateTime now = LocalDateTime.now ();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("dd.MM.yyyy HH:mm");

        System.out.println (now.toString());
        System.out.println (now.format (formatter));
    }
}