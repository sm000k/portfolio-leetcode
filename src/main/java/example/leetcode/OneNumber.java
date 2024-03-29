package example.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// czas realizacji 40 minut
//https://leetcode.com/problems/single-number/description/
public class OneNumber {
    public static int singleNumber(int[] numbers) {
        Set<Integer> appearedNumsSet = new HashSet<>();
        for (Integer number : numbers) {
            if (appearedNumsSet.contains(number)) {
                appearedNumsSet.remove(number);
            } else {
                appearedNumsSet.add(number);
            }
        }
        Iterator iterator = appearedNumsSet.iterator();
        return (int) iterator.next();
    }

    private static void unitTestSingleNumber(int[] input, int expected) {
        System.out.print(" input = " + Arrays.toString(input));
        System.out.print(" expected = " + expected);
        System.out.println(" result = " + (singleNumber(input) == expected ? "true" : "false"));
    }

    public static void main(String[] args) {
        unitTestSingleNumber(new int[]{2, 2, 1}, 1);
        unitTestSingleNumber(new int[]{4, 1, 2, 1, 2}, 4);
        unitTestSingleNumber(new int[]{1}, 1);
    }
}
