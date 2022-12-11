package Java_Lectures.Lecture6_9dec.Example5;

import java.util.Arrays;
import java.util.HashSet;

public class Exam5 {
    public static void main(String[] args) {

        // создаем экземпляр класса Worker
        Worker w1 = new Worker();
        w1.firstName = "Иван";
        w1.lastName = "Петров";
        w1.salary = 145;
        w1.id = 205;

        // создаем экземпляр класса Worker
        Worker w2 = new Worker();
        w2.firstName = "Сергей";
        w2.lastName = "Иванов";
        w2.salary = 100;
        w2.id = 240;

        // создаем экземпляр класса Worker
        Worker w3 = new Worker();
        w3.firstName = "Николай";
        w3.lastName = "Кузнецов";
        w3.salary = 170;
        w3.id = 301;

        // создаем экземпляр класса Worker
        Worker w4 = new Worker();
        w4.firstName = "Иван";
        w4.lastName = "Петров";
        w4.salary = 145;
        w4.id = 205;

        System.out.println(w1.toString());
        System.out.println(w2.toString());
        System.out.println(w3.toString());
        System.out.println(w4.toString());

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

    }

}
