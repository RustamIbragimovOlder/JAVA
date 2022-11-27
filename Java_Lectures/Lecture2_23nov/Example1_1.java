package Java_Lectures.Lecture2_23nov;

public class Example1_1 {
    public static void main(String[] args) {
        String[] name = { "C", "е", "р", "г", "е", "й" };
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Cергей
        System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
        System.out.println(String.join(",", "C", "е", "р", "г", "е", "й")); // C,е,р,г,е,й
    }
}
