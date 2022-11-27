1. Типы данных:
 
1.1. ссылочные (относятся к классам):
    массивы разного типа и рода
    другое позже
 
1.2. примитивные:
    boolean - логический тип,
    int, short, long и т.д. - целочисленный тип,
    float, double - вещественный тип,
    Char - символьный тип.

2. Создание переменной:
    <тип данных><идентификатор (или имя)>;  // объявление переменной
    <идентификатор> = <значение>;           // инициализация переменной
 
2.1. Целые числа:
    short age = 10;
    int salary = 123456;
    System.out.println(age);    // вывод 10
    System.out.println(salary); // вывод 123456

2.2. Вещественные числа:
    float e = 2.7f;            // обязательно использование суффикса f
    double pi = 3.1415
    System.out.println(e);     // вывод 2.7
    System.out.println(pi);    // вывод 3.1415

2.3. Символьный тип:
    char ch = '1';
    System.out.println(Character.isDigit(ch));    // вывод true
    
    ch = 'a';
    System.out.println(Character.isDigit(ch));    // вывод false

2.4. Логический тип:
    boolean flag1 = 123 <= 234;
    System.out.println(flag1);    // вывод true
    
    boolean flag2 = 123 >= 234 || flag1;
    System.out.println(flag2);    // вывод true

    boolean flag3 = flag1 ^ flag2;
    System.out.println(flag3);    // вывод false

2.5. Строки: (не так просты)!!!
    String msg = "Hello world";
    System.out.println(msg);    // вывод Hello world

2.6. Неявная типизация:
    var a = 12345;   // при компиляции будет подставлен наиболее подходящий тип (здесь int)
    var d = 123.456; // здесь double
    System.out.println(getType(a));    // вывод Integer
    System.out.println(getType(d));    // вывод Double
    
    3. Классы-обертки: нужны для получения большего функционала
    int - Integer
    short - Short
    long - Long
    byte - Byte
    float - Float
    double - Double
    char - Character
    boolean - Boolean
    
например:
    int i = 123;
    System.out.println(Integer.MAX_VALUE);    // вывод 2147483647 (максимально возможное число)

4. Операции:
    4.1. Операция присваивание: =
    4.2. Операции арифметические:
        * (умножение),
        / (деление),
        + (сложение),
        - (вычитание),
        % (остаток от деления),
        ++ (инкремент),
        -- (декремент).
    4.3. Операции сравнения:
        < - меньше,
        > - больше,
        == - равно,
        != - не равно,
        >= - больше или равно,
        <= - меньше или равно.
    4.4. Операции логические:
        || - конъюнкция,
        && - дизъюнкция,
        ^ - разделительная дизъюнкция,
        ! - инверсия.
    4.5. Операции побитовые:
        << - побитовый сдвиг влево, // a = 8 (то есть 1000), a << 1 = 16 (то есть 10000)
        >> - побитовый сдвиг вправо, // a = 18 (то есть 10010), a >> 1 = 9 (то есть 1001)
        & - И,
        | - ИЛИ,
        ^ - разделительное ИЛИ

5. Массивы:
    5.1. Одномерные массивы:
        int[] arr = new int[10];
        System.out.println(arr.length);    // вывод 10 - длина массива
    или
        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length);    // вывод 5 - длина массива

    5.2. Многомерные массивы:
    1 вариант
        int[] arr[] = new int[3][5];
        for (int[] line : arr) {
            for (int item : line) {
                System.out.printf("%d ", item);
            } 
            System.out.println();
        }

    2 вариант
        int[][] arr = new int[3][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

6. Преобразования (явные и неявные):

неявные - когда нет указания что и во что преобразовать
явные - когда четко указано что и во что преобразовать

 * byte -> short -> int -> long -> double
 * byte -> short -> int -> long -> float
 * byte -> short -> int -> double
 * byte -> short -> int -> float
 * char -> int -> long -> double
 * char -> int -> long -> float
 * char -> int -> double
 * char -> int -> float
например:
    public class Program {
        public static void main(String[] args) {
            int i = 123;
            double d = i;
            System.out.println(i);  // 123
            System.out.println(d);  // 123.0
            d = 3.1415;
            i = (int)d;
            System.out.println(d);  // 3.1415
            System.out.println(i);  // 3
            d = 3.9415; i = (int)d;
            System.out.println(d);  // 3.9415
            System.out.println(i);  // 3
            byte b = Byte.parseByte("123");
            System.out.println(b);  // 123
            b = Byte.parseByte("1234");
            System.out.println(b);  // NumberFormatException: Value out of range
   }
}
  
7. Получение данных от пользователя (из терминала):

    7.1. Строки

    import java.util.Scanner;

    public class program {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("name: ");
            String name = iScanner.nextLine();
            System.out.printf("Привет, %s!\n", name);
            iScanner.close();
        }
    }
 
    7.2. Некоторые примитивы

    import java.util.Scanner;

    public class program {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("int a: ");
            int x = iScanner.nextInt();
            System.out.printf("double a: ");
            double y = iScanner.nextDouble();
            System.out.printf("%d + %f = %f", x, y, x + y);
            iScanner.close();
        }
    }
 
    7.3. Проверка на соответствие получаемого типа

    import java.util.Scanner;

    public class program {
        public static void main(String[] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.printf("int a: ");
            boolean flag = iScanner.hasNextInt();
            System.out.println(flag);
            int i = iScanner.nextInt();
            System.out.println(i);
            iScanner.close();
        }
    } 

8. Форматированный вывод:

    1 вариант
    
    public class program {
        public static void main(String[] args) {
            int a = 1, b = 2;
            int c = a + b;
            String res = a + " + " + b + " = " + c;
            System.out.println(res);
        }
    }

    2 вариант

    public class program {
        public static void main(String[] args) {
            int a = 1, b = 2;
            int c = a + b;
            String res = String.format("%d + %d = %d \n", a, b, c);
            System.out.printf("%d + %d = %d \n", a, b, c);
            System.out.println(res);
        }
    }

Виды спецификаторов: 
 * %d: для вывода целочисленных значений
 * %x: для вывода шестнадцатеричных чисел
 * %f: для вывода чисел с плавающей точкой
 * %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
 * %c: для вывода одиночного символа
 * %s: для вывода строковых значений


например количество знаков после запятой:

public class program {
    public static void main(String[] args) {
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00
    }
}

9. Область видимости переменных:
У переменных существует понятие «область видимости».
Если переменную объявили внутри некоторого блока фигурных скобок { },
то снаружи этого блока переменная будет недоступна.

например:

public class Program {
    public static void main(String[] args) {
        int i = 123;
        System.out.println(i);           
    }     
    System.out.println(i);  // error: cannot find symbol
}

10. Функции (методы):
Функции и методы — это технически одно и то же.
Функции могут не принадлежать классам, а методы принадлежат.
В java все функции являются методами. 

Состав функции:
 * Описание
 * Вызов
 * Возвращаемое значение
 * Рекурсия (отдельно)

например:
public class Program {
    
    static void sayHi() {
        System.out.println("hi!");
    }
    
    static int sum(int a, int b) {
        return a+b;
    }  
    
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}

11. Управляющие конструкции:

    11.1. Условный оператор ветвления if

public class program {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        int c;
        
        if (a > b) {
            c = a;
        }
        else {
            c = b;
        }
        System.out.println(c);
    }
}

или сокращенная форма:

public class program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;
        System.out.println(c);
    }
}

    11.2. Тернарный оператор ?
    если условие выполняется - вернется значение от ? до :
    если условие не выполняется - вернется значение от :  

например:

public class Program {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int min = a < b ? a : b;
        System.out.println(min);
    }
}

    11.3. Оператор выбора switch:

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
		...
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}

12. Циклы:
Цикл — это многократное выполнение одинаковой последовательности действий.
В java доступны следующие циклы:
 * цикл while;
 * цикл do while;
 * цикл for;
 * и его модификация for in

    12.1. Цикл while:

public class Program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
}

    12.2. Цикл do while:

public class Program {
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }
}

    12.3. Управление циклами:
Операторы для управления циклами — continue и break.
Выполнение следующей итерации цикла — continue.
Прерывание текущей итерации цикла — break.
* ближайшего к оператору
Однако, использование continue и break, так же и go to - ОЧЕНЬ НЕКРАСИВО!!!

    12.4. Оператор цикла for:

public class program {
    public static void main(String[] args) {

        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }
}

    12.5. Вложенные циклы:

public class program {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
    }
}

    12.6. Цикл for: (или for in)
Работает только для коллекций

public class program {
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}

13. Работа с файлами:

    13.1. Создание и запись\ дозапись

import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

    13.2. Чтение, Вариант посимвольно

import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            }
            else {
                System.out.print(ch);
            }
        }
    }
}

    13.3. Чтение, Вариант построчно

import java.io.*;

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}