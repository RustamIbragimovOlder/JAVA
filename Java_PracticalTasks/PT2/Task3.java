// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Java_PracticalTasks.PT2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("string_PT2_3.txt"));
        String data;
        StringBuilder sb1 = new StringBuilder();
        while ((data = br.readLine()) != null) {
            System.out.println(data);
            data = data.substring(1, data.length() - 1);
            data = data.replaceAll("\\{", "");
            data = data.replaceAll("\\}", "");
            String[] dn = data.split(", ");
            
            for (int i = 0; i < dn.length; i++) {
                String[] dn1 = dn[i].split(",");
                
                for (int j = 0; j < dn1.length; j++) {
                    String[] dn2 = dn1[j].split(":");
                    String key = dn2[0];
                    key = key.substring(1, key.length() - 1);
                    String value = dn2[1];
                    value = value.substring(1, value.length() - 1);
                    sb1.append(value);
                    sb1.append(" ");
                }
            }
        }
        String[] strArray = sb1.toString().split(" ");
        for (int i = 0; i < strArray.length; i += 3) {
            System.out.println("Студент " + strArray[i] + " получил " + strArray[i + 1]
                                + " по предмету " + strArray[i + 2] + ".");
        }
        try {
            if (br != null) {
                br.close();
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения файла");
        }
    }
}