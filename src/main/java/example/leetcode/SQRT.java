package example.leetcode;

public class SQRT {
    public static int mySqrt(int x) {
        double testValue = 45000;
        double testVar = 0;
        while (testVar <= x) {

            testValue++;
            testVar = testValue * testValue;
        }

        return (int) testValue - 1;
    }

    public static void main(String[] args) {
//        System.out.println(mySqrt(155));
        System.out.println(mySqrt(2147395600));
    }
}
