package example.leetcode;

public class SQRT {
    public static void unitTestSQRT(Integer input, Integer expected) {
        Integer output = mySqrt(input);
        System.out.println();
        System.out.print(output.equals(expected));
    }

    public static int mySqrt(int x) {

        if (x == 0) {
            return 0;
        }
        int left = 1;
        int right = Integer.MAX_VALUE;
        int mid = 0;
        while (true) {
            mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                if ((mid + 1) > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }


        }
    }

    public static void main(String[] args) {

        unitTestSQRT(4, 2);
        unitTestSQRT(8, 2);
    }
}
