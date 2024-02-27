package example.drafts;

import java.util.Arrays;
import java.util.Map;

public class fibo {
    public static int fibonacci(int n) {

        System.out.println(n);
        if (n<2) {
            return n;
        }
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


    public static void main(String[] args) {
        int fibonacci = fibonacci(3);
        System.out.println("fibonacci = " + fibonacci);
    }
}
