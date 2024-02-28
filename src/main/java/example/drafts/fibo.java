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
    public static int countHi2(String str) {
        System.out.println(str);
        if (str.length()<2){
            return 0;
        }
        int flag = 0;

        if(str.substring(1,3).equals("hi") ){
            flag = 1;
        }
        return flag + countHi2(str.substring(1));
    }



    public static void main(String[] args) {
        int fibonacci = fibonacci(3);
        System.out.println("fibonacci = " + fibonacci);
        countHi2("Yellow Stone");
    }
}
