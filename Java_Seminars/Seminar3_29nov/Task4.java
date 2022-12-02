// Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>>
// так, что на 0-й позиции каждого внутреннего списка содержится название жанра,
// а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

package Java_Seminars.Seminar3_29nov;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<String>());
        }
        
        // list.add(new ArrayList<String>());
        // list.add(new ArrayList<String>());
        // list.add(new ArrayList<String>());

        Scanner sc = new Scanner(System.in, "cp866");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Введите жанр книги => ");
            list.get(i).add(sc.nextLine());
            
            for (int j = 0; j < 5; j++) {
                System.out.println("Введите название книги => ");
                list.get(i).add(sc.nextLine());

            }


        }
        sc.close();
        System.out.println(list);


    }

}
