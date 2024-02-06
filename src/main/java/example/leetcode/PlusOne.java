package example.leetcode;

import java.util.Arrays;


//https://leetcode.com/problems/plus-one/description/
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
//
//
//
//        Example 1:
//
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
//Example 2:
//
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
//Example 3:
//
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
//
//
//Constraints:
//
//        1 <= digits.length <= 100
//        0 <= digits[i] <= 9
//digits does not contain any leading 0's.
public class PlusOne {


    static int[] expandArray(int[] array) {

        int[] newArray = new int[array.length + 1];
        newArray[0] = 1;
        // ide podpowiada abym uzył array copy
        // warning: Manual array copy
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    static void presentSummary(int[] InputArray, int[] resultArray) {
        System.out.println(Arrays.toString(InputArray) + "+1=" + Arrays.toString(resultArray));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int digitsIndex = digits.length - 1;
        while (carry > 0 && digitsIndex > -1) {
            if (digits[digitsIndex] < 9) {
                digits[digitsIndex] += 1;
                carry = 0;
            }
            if (digits[digitsIndex] == 9) {
                digits[digitsIndex] = 0;
                carry = 1;
            }
            digitsIndex--;
        }
        if (carry == 1) {
            return expandArray(digits);
        }
        return digits;
    }

    public static void main(String[] args) {

        presentSummary(new int[]{2, 3, 4, 5}, plusOne(new int[]{2, 3, 4, 5}));
        presentSummary(new int[]{9, 9, 9, 9}, plusOne(new int[]{9, 9, 9, 9}));
        presentSummary(new int[]{9}, plusOne(new int[]{9}));
        presentSummary(new int[]{4, 3, 2, 1}, plusOne(new int[]{4, 3, 2, 1}));
    }
}
