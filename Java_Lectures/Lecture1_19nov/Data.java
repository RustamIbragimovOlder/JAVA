public class Data {
    public static void main(String[] args) {
        int i = 123;
        System.out.println(i); // выводит в консоль i
        System.out.println(Integer.MAX_VALUE); // выводит в консоль максимально возможное число
        System.out.println(Integer.MIN_VALUE); // выводит в консоль минимально возможное число
        
        // Целые числа:
        short age = 10;
        int salary = 123456;
        System.out.println(age);    // вывод 10
        System.out.println(salary); // вывод 123456
        
        // Вещественные числа:
        float e = 2.7f;            // обязательно использование суффикса f
        double pi = 3.1415;
        System.out.println(e);     // вывод 2.7
        System.out.println(pi);    // вывод 3.1415
        
        // Символьный тип:
        char ch = '1';
        System.out.println(Character.isDigit(ch));    // вывод true
        ch = 'a';
        System.out.println(Character.isDigit(ch));    // вывод false
        
        // Логический тип:
        boolean flag1 = 123 <= 234;
        System.out.println(flag1);    // вывод true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);    // вывод true
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);    // вывод false
        
        // Строки: (не так просты)!!!
        String msg = "Hello world";
        System.out.println(msg);    // вывод Hello world
        
        // Неявная типизация:
        // var a = 12345;   // при компиляции будет подставлен наиболее подходящий тип (здесь int)
        // var d = 123.456; // здесь double
        // System.out.println(getType(a));    // вывод Integer
        // System.out.println(getType(d));    // вывод Double
    }
}


