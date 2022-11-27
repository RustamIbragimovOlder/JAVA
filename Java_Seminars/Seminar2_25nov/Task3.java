// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом
// (возвращает boolean значение).


package Java_Seminars.Seminar2_25nov;

public class Task3 {
    public static void main(String[] args) {
        String s = "123454321";
        System.out.println(s);
        String res = new StringBuilder(s).reverse().toString();
        System.out.println(res);
        System.out.println((s.equals(res)));
    }

       
}
