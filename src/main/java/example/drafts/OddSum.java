package example.drafts;

public class OddSum {

    public static int oddSum(int n) {
        System.out.println(n);
        if (n == 1) return 1;
        return n + oddSum(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(oddSum(9));
    }
}
