// Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
// которое является архивом выставки котов

package Java_Seminars.Seminar6_9dec.Task2b;

import java.time.LocalDate;
import java.time.Month;

public class Task2b {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", "сфинкс", "grey", LocalDate.of(2021, Month.AUGUST, 15), "Петров");
        Cat bars = new Cat("Bars", "ангорка", "white", LocalDate.of(2018, Month.FEBRUARY, 3), "Иванов");

        tom.addAward(new Award("Best color 2022", "Москва", 2022, "2st"));
        tom.addAward(new Award("Самый шершавый кот", "Хабаровск", 2022, "1st"));
        bars.addAward(new Award("Самый пушистый", "Оренбуг", 2022, "1st"));

        System.out.println(tom);
        System.out.println(bars);

    }

}
