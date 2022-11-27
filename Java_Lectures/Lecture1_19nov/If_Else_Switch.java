public class If_Else_Switch {
    public static void main(String[] args) {
        // развернутая форма
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

        // сокращенная форма
        int x = 1;
        int y = 2;
        int z = 0;
        if (x > y) z = x;
        if (y > x) z = y;
        System.out.println(z);

        // Тернарный оператор
        int m = 5;
        int n = 2;
        int min = m < n ? m : n;
        System.out.println(min);
       
    }
}
