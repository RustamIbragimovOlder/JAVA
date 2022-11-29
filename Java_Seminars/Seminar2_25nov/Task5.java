// Напишите метод, который вернет содержимое текущей папки в виде массива строк. 
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл. 
// Обработайте ошибки с помощью try-catch конструкции.
// В случае возникновения исключения, оно должно записаться в лог-файл.

// Создать логгер (Logger logger = Logger.getLogger (test2.class.getName ());)
// Использовать
// catch () {
// 	logger.log
// 	logger.info
// 	logger.info
// }

package Java_Seminars.Seminar2_25nov;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task5 {
    public static void main(String[] args) {
        String[] fileList = dirList("./");
        for (int i = 0; i < fileList.length; i++) {
            System.out.println(fileList[i]);
        }

        Logger logger = Logger.getLogger(Task5.class.getName());
        try {
            writeFile(fileList);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, "Error1", ex);
        } catch (NullPointerException npe) {
            logger.log(Level.SEVERE, "Error2", npe);
        }
    }

    // метод возврата содержимого текущей папки в виде массива строк
    public static String[] dirList(String dir) {
        File file = new File(dir);
        String[] fileList = file.list();
        return fileList;
    }

    // метод записи массива в файл
    public static void writeFile(String[] S) throws IOException {
        String address = System.getProperty("user.dir").concat("/filesList_sem2task5.txt");
        File file = new File(address);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            // writer.write(S);
            for (int i = 0; i < S.length; i++) {
                writer.write(S[i] + "\n");
            }
            System.out.println("Success123!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //     try (FileWriter writer = new FileWriter("filesList_sem2task5.txt", false)) { // запись всей строки
    //         for (int i = 0; i < str.length; i++) {
    //             writer.write(str[i] + "\n");
    //         }
    //         writer.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     } catch (NullPointerException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }
}

