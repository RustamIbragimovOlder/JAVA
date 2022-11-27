public class Functions {
    public static void main(String[] args) {
        
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }

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
}
