// Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл,
// обработайте исключения.

package Java_Seminars.Seminar2_25nov;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
// import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        // System.out.println(composeString (100, "Test"));
        RecFile(composeString (100, "Новая Проверка"));
    }

    public static String composeString (int n, String S) {
        String res = S.repeat(n);
        return res;
    }

    public static void RecFile (String S) {
        String address = System.getProperty("user.dir").concat("/sem2task4.txt");
        File file = new File(address);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(S);
            System.out.println("Success!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        

    //     try (FileWriter f1 = new FileWriter("sem2task4.txt", false)) {
    //         f1.write(S);
    //         f1.flush();
    //     }
    //     catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    }
}