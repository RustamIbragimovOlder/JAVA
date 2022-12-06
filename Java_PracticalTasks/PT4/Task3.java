// Напишите постфиксный калькулятор.
// Пользователь вводит данные и операции в обратной польской записи.
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
// Например:
// 5 4 3 - + => 5 1 + => 6

package Java_PracticalTasks.PT4;

import java.util.Scanner;
import java.util.Stack;

// Вариант на основе лекции (+ простой, - ввод в постфиксной форме)
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Особенностью RPN (Reverse Polish notation) является то,\nчто все аргументы (или операнды) расположены перед знаком операции.\nВ общем виде запись выглядит следующим образом:\nЗапись набора операций состоит из последовательности операндов и знаков операций.\nОперанды в выражении при письменной записи разделяются пробелами.\nВыражение читается слева направо.\nКогда в выражении встречается знак операции,\nвыполняется соответствующая операция над двумя последними встретившимися перед ним операндами в порядке их записи.\nРезультат операции заменяет в выражении последовательность её операндов и её знак,\nпосле чего выражение вычисляется дальше по тому же правилу.\nРезультатом вычисления выражения становится результат последней вычисленной операции");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные и операции в форме Reverse Polish notation (RPN) -> ");
        String input = scanner.nextLine(); // ввод данных от пользователя
        
        // пример:
        // 395 / 17 + 16 * 3 - 13 обычная запись (результат 58.235)
        // 17 395 / 16 3 * + 13 - постфиксная запись

        String[] postfixView = input.split(" "); // разбор строки по пробелу
            
        double result = 0;
        Stack<Double> stackTest = new Stack<>();

        for (int i = 0; i < postfixView.length; i++) {

            if (isDigit(postfixView[i])) {
                stackTest.push(Double.parseDouble(postfixView[i]));
            } else {
                switch (postfixView[i]) {
                    case "+":
                        result = stackTest.pop() + stackTest.pop();
                        stackTest.push(result);
                        break;
                    case "-":
                        result = -stackTest.pop() + stackTest.pop();
                        stackTest.push(result);
                        break;
                    case "*":
                        result = stackTest.pop() * stackTest.pop();
                        stackTest.push(result);
                        break;
                    case "/":
                        result = stackTest.pop() / stackTest.pop();
                        stackTest.push(result);
                        break;
                    default:
                        break;
                }
            }
            System.out.println(stackTest); // проверка хода скрипта на каждом этапе
        }
        System.out.printf("%.3f\n", stackTest.pop());
        scanner.close();
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}