// Вычислить n-ое треугольное число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

package Java_PracticalTasks.PT1;

import java.math.BigInteger;
import java.util.Scanner;

public class PT1_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print ("Input n: ");
        int n = in.nextInt();
        in.close ();
        int sum = 0;
        int mult1 = 1;                     // актуально для малых значений n (n < 13)
        BigInteger mult2 = BigInteger.ONE; // актуально для больших значений n
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            mult1 = mult1 * i;                             // актуально для малых значений n (n < 13)
            mult2 = mult2.multiply(BigInteger.valueOf(i)); // актуально для больших значений n
        }
        System.out.printf ("сумма чисел от 1 до n: %d \n", sum);
        System.out.printf ("произведение чисел от 1 до n: %d \n", mult1);
        System.out.printf ("произведение чисел от 1 до n: %d \n", mult2);
    }
}


