// Даны 2 строки.
// Написать метод, который вернет true, если эти строки являются изоморфнымии,
// и вернет false, если нет.
// Строки изоморфны, если одну букву в первом слове можно заменить
// на некоторую букву во втором слове,
// при этом повторяющиеся буквы одного слова меняются на одну и ту же букву
// с сохранением порядка следования.
// (Например, add - egg изоморфны)
// Буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

package Java_Seminars.Seminar5_6dec;

import java.util.HashMap;

// Вариант 1

// public class Task1 {
//     public static void main (String[] args) {
//         String str1 = "paper";
//         String str2 = "title";
//         System.out.println(isIsomorph(str1, str2));
//         // isIsomorph(str1, str2);
//     }

//     public static boolean isIsomorph (String a, String b) {
//         HashMap<Character, Character> mapTest = new HashMap<>();
//         if (a.length() != b.length()) {
//             return false;
//         }
//         for (int i = 0; i < a.length(); i++) {
//             if (mapTest.containsKey(a.charAt(i))) {
//                 if (!mapTest.get(a.charAt(i)).equals(b.charAt(i))) {
//                     return false;
//                 }
//             }
//             mapTest.put(a.charAt(i), b.charAt(i));
//         }
//         return true;
//     }

// }


// Вариант 2

public class Task1 {
    public static void main (String[] args) {
        printResult("add", "egg");
        printResult("note", "code");
        printResult("foo", "bar");
        printResult("paper", "title");
    }

    public static boolean isIsomorph (String a, String b) {
        HashMap<Character, Character> letterToLetter = new HashMap<>();
        
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (letterToLetter.containsKey(a.charAt(i))) {
                if (letterToLetter.get(a.charAt(i)) != b.charAt(i)) {
                    return false;
                }
            }
            else {
                letterToLetter.put(a.charAt(i), b.charAt(i));
            }
        }
        return true;
    }

    public static void printResult (String a, String b) {
        System.out.println(String.format("%s; %s; %s", a, b, isIsomorph(a, b) ? "true" : "false"));
    }
}