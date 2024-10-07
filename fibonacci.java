public class fibonacci {

    public static int fib(int n) {
        if (n < 0 || n > 45) {
            throw new IllegalArgumentException("n should be between 0 and 45.");
        }
        else{ 
            if (n == 0) {
                return 0;
            } 
            else if (n == 1) {
                return 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }
    }

    public static int itFib(int n) {
        if (n < 0 || n > 46) {
            throw new IllegalArgumentException("n should be between 0 and 46.");
        }
        else {
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
    }

    public static void main(String[] args) {
        //test
        System.out.println(fib(20));
        System.out.println(itFib(3));
        System.out.println(fib(5));
        System.out.println(fib(6));
    }
}
