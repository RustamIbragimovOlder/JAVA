// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package Java_Seminars.Seminar5_6dec;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        printResult("a+(d*3)");
        printResult("[a+(1*3)");
        printResult("[6+(3*3)]");
        printResult("{a}[+]{(d*3)}");
        printResult("<{a}+{(d*3)}>");
        printResult("{a+]}{(d*3)}");
    }
    
    public static boolean areBracketsPaired (String expression) {
        ArrayDeque<Character> bracketsInExpression = new ArrayDeque<>();
        Map<Character, Character> openingToClossingBrackets = new HashMap<>();
        openingToClossingBrackets.put('(', ')');
        openingToClossingBrackets.put('[', ']');
        openingToClossingBrackets.put('{', '}');
        openingToClossingBrackets.put('<', '>');

        for (int i = 0; i < expression.length(); i++) {
            if (openingToClossingBrackets.containsKey(expression.charAt(i))) { // проверка что символ строки является открывающейся скобкой
                bracketsInExpression.addLast(expression.charAt(i));
            } else if (openingToClossingBrackets.containsValue(expression.charAt(i))) { // текущий символ является закрывающей скобкой
                if (bracketsInExpression.isEmpty()) return false;
                else if (expression.charAt(i) != openingToClossingBrackets.get(bracketsInExpression.getLast())) return false;
                
                bracketsInExpression.removeLast();
            }
        }
        return bracketsInExpression.isEmpty();
        }
        
    public static void printResult (String expression) {
        System.out.println(String.format("%s; %s", expression, areBracketsPaired(expression) ? "true" : "false"));
    }
}
