package Java_Lectures.Lecture2_23nov;

import java.io.File;

public class Example1_2 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file3.txt");
            File f3 = new File(pathFile);
            System.out.println(f3.getAbsolutePath());
            System.out.println(pathFile);
            
        } catch (Exception e) {
            File f1 = new File("file1.txt");
            System.out.println(f1.getAbsolutePath());
            System.out.println("catch");
        }
        finally
        {
            File f2 = new File("/Users/sk/vscode/java_projects/file2.txt");
            System.out.println(f2.getAbsolutePath());
            System.out.println("finally"); }
   }
}

