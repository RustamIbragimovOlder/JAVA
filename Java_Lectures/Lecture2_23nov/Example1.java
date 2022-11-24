package Java_Lectures.Lecture2_23nov;

public class Example1 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        // создать строку из 1 млн "+", будет выполняться около 1 мин.
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+";
        }
        System.out.println(System.currentTimeMillis() - s);
        // есть другой способ, будет выполняться около 9 msec.
        var d = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - d);
        // System.out.println(str);
        // System.out.println(sb);
    }
}
// Что такое API для нас: строки

// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках

// например:
// public class program {
//     public static void main(String[] args) {
//       String[] name = { "C", "е", "р", "г", "е", "й" };
//       String sk = "СЕРГЕЙ КА.";
//       System.out.println(sk.toLowerCase()); // сергей ка.
//       System.out.println(String.join("", name)); // Cергей
//       System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//       // C,е,р,г,е,й
//       System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
//      }
//   }

// САМОЕ ГЛАВНОЕ:
// Много изменений – String
// Много преобразований – StringBuilder 

