// Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

package Java_Seminars.Seminar3_29nov;

public class Task0 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        char l = 'l';
        String s41 = "h" + "e" + l + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        // проверка равенства строк
        System.out.println(s1 == s2); // true, объекты разные, но одинаковые, т.е. записаны один раз
        System.out.println(s1 == s3); // true, переменных две, но объект один
        System.out.println(s1 == s4); // true, потому что константы
        System.out.println(s1 == s41); // false, значения равны, но это новый объект
        System.out.println(s1 == s5); // false, new - новый объект!!!
        System.out.println(s1 == s6); // false, new - новый объект!!!
        System.out.println(s5 == s6); // false, new - новый объект!!!

        // проверка равенства значений
        System.out.println(s1.equals(s5)); // true, потому что значения одинаковы
        System.out.println(s1.equalsIgnoreCase(s5)); // при сравнении игнорирует регистр (строчные или прописные)
    }
    
}