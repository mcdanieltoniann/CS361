public class fibonacci {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            int temp = a;
            a = a + b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        //test
        System.out.println(fib(20));
        System.out.println(fib(3));
        System.out.println(fib(6));
    }
}