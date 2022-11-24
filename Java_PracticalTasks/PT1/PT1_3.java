// Реализовать простой калькулятор

package Java_PracticalTasks.PT1;

import java.util.Scanner;

public class PT1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число А: ");
        float a = iScanner.nextFloat();
        System.out.printf("Введите операцию: ");
        String operation = iScanner.next();
        System.out.printf("Введите число B: ");
        float b = iScanner.nextFloat();

        if (operation.contains("+")) {
            System.out.printf("%.2f + %.2f = %.2f", a, b, a + b);
            System.out.println();
        }
        else if (operation.contains("-")) {
            System.out.printf("%.2f - %.2f = %.2f", a, b, a - b);
            System.out.println();
        }
        else if (operation.contains("*")) {
            System.out.printf("%.2f * %.2f = %.2f", a, b, a * b);
            System.out.println();
        }
        else if (operation.contains("/")) {
            System.out.printf("%.2f / %.2f = %.2f", a, b, a / b);
            System.out.println();
        }
        iScanner.close();
    }
}
