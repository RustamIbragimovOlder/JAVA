// Напишите метод, который принимает на вход строку (String)
// и определяет является ли строка палиндромом
// (возвращает boolean значение).

package Java_Seminars.Seminar2_25nov;

public class Task3 {
    public static void main (String[] args) {
        String str = "12asd34543dsa21";
        System.out.println(str);
        System.out.println(check_palindrome(str));
    }

        public static boolean check_palindrome (String S) {
        String res = new StringBuilder(S).reverse().toString();
        return (S.equals(res));
    }
}