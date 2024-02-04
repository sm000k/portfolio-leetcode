package example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HappyNumber {
    static List<Integer> fractureNumber(Integer n) {
        List<Integer> digitsList = new ArrayList<>();

        while (n >= 10) {
            digitsList.add(n % 10);
            n /= 10;
        }
        digitsList.add(n);
        return digitsList;
    }

    static Integer squareSum(List<Integer> inputList) {
        int sum = 0;
        for (Integer number : inputList) {
            sum += number * number;
        }
        return sum;
    }


    static public boolean isHappy(Integer n) {
        Integer slowSum = n;
        Integer fastSum = n;
        do {
            slowSum = squareSum(fractureNumber(slowSum));
            fastSum = squareSum(fractureNumber(fastSum));
            fastSum = squareSum(fractureNumber(fastSum));
        } while (!Objects.equals(slowSum, fastSum));

        if (slowSum == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> TestNumbers = Arrays.asList(19, 3, 1, 103);
        for (Integer testNumber : TestNumbers) {
            System.out.println(testNumber + " : " + fractureNumber(testNumber) + " = " + isHappy(testNumber));
        }
    }
}
