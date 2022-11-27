public class Formatted_output {
    public static void main(String[] args) {
        
        // Var 1
        int a = 1, b = 2;
        int c = a + b;
        String res1 = a + " + " + b + " = " + c;
        System.out.println(res1);

        // Var 2
        int x = 1, y = 2;
        int z = x + y;
        String res2 = String.format("%d + %d = %d \n", x, y, z);
        System.out.printf("%d + %d = %d \n", x, y, z);
        System.out.println(res2);

        // количество знаков после запятой
        float pi = 3.1415f;
        System.out.printf("%f\n", pi);    // 3,141500
        System.out.printf("%.2f\n", pi);  // 3,14
        System.out.printf("%.3f\n", pi);  // 3,141
        System.out.printf("%e\n", pi);    // 3,141500e+00
        System.out.printf("%.2e\n", pi);  // 3,14e+00
        System.out.printf("%.3e\n", pi);  // 3,141e+00

    }
}
