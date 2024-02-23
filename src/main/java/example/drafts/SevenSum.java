package example.drafts;

public class SevenSum {
    public static int count7(int n) {

        if (n == 0) return 0;
        int isSeven = 0;
        if (n % 10 == 7) {
            isSeven = 1;
        }

        return isSeven + count7(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(count7(717));//expected = 2
    }
}
