import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args) throws Exception {
        
        // Создание и запись\ дозапись
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Чтение, Вариант посимвольно
        // FileReader fr = new FileReader("file.txt");
        // int c;
        // while ((c = fr.read()) != -1) {
        //     char ch = (char) c;
        //     if (ch == '\n') {
        //         System.out.print(ch);
        //     }
        //     else {
        //         System.out.print(ch);
        //     }
        // }

        // Чтение, Вариант построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();

    }
}
