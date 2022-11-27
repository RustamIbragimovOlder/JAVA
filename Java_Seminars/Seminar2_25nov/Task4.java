// Напишите метод, который составит строку,
// состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл,
// обработайте исключения.

package Java_Seminars.Seminar2_25nov;

public class Task4 {
    public static void main(String[] args) {
        // вызов функции
        System.out.println(composeString(100));

        
    }

    public static String composeString (int n) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            res.append("TEST");
        }
        return res.toString();
    }

    public static void FileWrite () {

    }

    
}



