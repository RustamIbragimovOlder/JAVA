package Java_Lectures.Lecture2_23nov;

public class Example1 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        // создать строку из 1 млн "+", будет выполняться около 1 мин.
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str = str + "+";
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
