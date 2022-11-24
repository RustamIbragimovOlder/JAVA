// Вывести все простые числа от 1 до 1000

package Java_PracticalTasks.PT1;

public class PT1_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {          // i = 2, т.к. число 1 — не является простым
            boolean conformity = true;
            for(int j = 2; j < i; j++) {
                if (i % j == 0) {
                    conformity = false;
                    break;
                }
            }
            if (conformity) {
                System.out.print(i + ", ");
            }
        }
    }
}
