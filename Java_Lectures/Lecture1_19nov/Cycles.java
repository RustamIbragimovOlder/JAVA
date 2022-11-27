public class Cycles {
    public static void main(String[] args) {
        
        // Цикл while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);

        // Цикл do while
        int value1 = 321;
        int count1 = 0;

        do {
            value1 /= 10;
            count1++;
        } while (value1 != 0);
        System.out.println(count1);

        // Оператор цикла for
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);

        // Вложенные циклы
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Цикл for in (Работает только для коллекций)

        int arr[] = new int[10];
        for (int item : arr) {
            System.out.printf("%d ", item);
        }
        System.out.println();
    }
}
