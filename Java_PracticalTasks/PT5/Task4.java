// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

package Java_PracticalTasks.PT5;

import java.util.Arrays;

public class Task4 {
    public static void main (String[] args) {
        
        int N = 8; // шахматная доска 8×8
        char[][] mat = new char[N][N]; // проверка положения ферзей
 
        for (int i = 0; i < N; i++) { // инициализируем шахматную доску с помощью `х`
            Arrays.fill(mat[i], 'х');
        }
 
        findingSolution(mat, 0); // вызов функции
        
    }
    
    // функция проверки, угрожают ли два ферзя друг другу (r - ряд, c - столбец)
    private static boolean securityCheck (char[][] mat, int r, int c) {
        
        for (int i = 0; i < r; i++) {
            if (mat[i][c] == 'Ф') {
                return false; // если два ферзя стоят в одном столбце - false
            }
        }
 
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (mat[i][j] == 'Ф') {
                return false; // если два ферзя стоят на одной диагонали вправо - false
            }
        }
 
        for (int i = r, j = c; i >= 0 && j < mat.length; i--, j++) {
            if (mat[i][j] == 'Ф') {
                return false; // если два ферзя стоят на одной диагонали влево - false
            }
        }

        return true; // если два ферзя не стоят в одном столбце и на одной диагонали
    }

    // функция вывода решения
    private static void printSolution (char[][] mat) {
        for (char[] chars : mat) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }

    // функция поиска решения
    private static void findingSolution (char[][] mat, int r) {
        
        if (r == mat.length) { // если ферзи расставлены успешно, выводим решение
            printSolution(mat);
        }
        
        for (int i = 0; i < mat.length; i++) { // помещаем ферзя на каждую клетку в текущем ряду и повторяем для каждого допустимого движения
        
            if (securityCheck(mat, r, i)) { // если никакие два ферзя не угрожают друг другу
            
                mat[r][i] = 'Ф'; // ставим ферзя на текущую клетку
                findingSolution (mat, r + 1); // повторить для следующей строки
                mat[r][i] = 'х'; // возвращаемся назад и удаляем ферзя с текущей клетки
            }
        }
    }
}