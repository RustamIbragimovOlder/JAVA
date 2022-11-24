package Java_Lectures.Lecture2_23nov;

import java.io.File;

public class Example2 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
        // Работа с файловой системой. Файлы
        // Для работы нужно:
        // File <имя> = new File(<полный путь к файлу>);
        
        // File f1 = new File("file.txt");
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        
        // Что предпочтительнее?
                
        
    }
}


// Работа с файловой системой. Файлы. Ошибки
// try {
//     // Блок 1 - Код, в котором может появиться ошибка
//   } catch (Exception e) {
//     // Блок 2 - Обработка, если ошибка случилась
//   }
//   finally {
//     // Блок 3 - Код, который выполнится в любом случае
//   }
// например:
// import java.io.File;
// public class tryDemo {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        }
//        finally
//        { System.out.println("finally"); }
//    }
// }

// или другой пример:
// import java.io.File;
// public class tryDemo {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File file = new File(pathFile);
//            if (file.createNewFile()) {
//                System.out.println("file.created");
//            }
//            else {
//                System.out.println("file.existed");
//            }
//        } catch (Exception e) {
//         System.out.println("catch");
//        } finally {
//     System.out.println("finally");
// }

// или еще пример:
// String line = "empty";
// try {
//    File file = new File(pathFile);
//    if (file.createNewFile()) {
//        System.out.println("file.created"); }
//    else {
//        BufferedReader bufReader =
//        new BufferedReader(new FileReader(file));
//        System.out.println("file.existed");
//        line = bufReader.readLine();
//        bufReader.close(); }
// } catch (Exception e) {
//    //e.printStackTrace();
// } finally {
//    System.out.println(line);
// }

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся 
// в определенном каталоге

// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения 
// файла или каталога

// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые 
// находятся в определенном каталоге

// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

// Работа с файловой системой. Каталоги
// import java.io.File;
// public class Ex0043 {
//    public static void main(String[] args) {
//        String pathProject = System.getProperty("user.dir");
//        String pathDir = pathProject.concat("/files");
//        File dir = new File(pathDir);
//        System.out.println(dir.getAbsolutePath());
//        if (dir.mkdir()) {
//            System.out.println("+");
//        } else {
//            System.out.println("-");
//        }
//        for (String fname : dir.list()) {
//            System.out.println(fname);
//        } } 
// }