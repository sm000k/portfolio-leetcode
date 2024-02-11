package example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// czas realizacji 50 minut
// https://leetcode.com/problems/majority-element/description/
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2


Constraints:

n == nums.length
1 <= n <= 5 * 104
        -109 <= nums[i] <= 109


Follow-up: Could you solve the problem in linear time and in O(1) space?
*/
public class MajorityElements {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> AppearedNumberCountMap = new HashMap<>();

        for (int number : nums) {
            if (AppearedNumberCountMap.containsKey(number)) {
                AppearedNumberCountMap.put(number, AppearedNumberCountMap.get(number) + 1);
            } else {
                AppearedNumberCountMap.put(number, 1);
            }
        }
        int maxElementCount = 0;
        int majorityElement = 0;
        for (Map.Entry<Integer, Integer> entry : AppearedNumberCountMap.entrySet()) {
            if (entry.getValue() > maxElementCount) {
                maxElementCount = entry.getValue();
                majorityElement = entry.getKey();
            }
        }
        return majorityElement;
    }

    static void unitTestMajorityElement(int[] input, int expected) {

        System.out.print(" input = " + Arrays.toString(input));
        System.out.print(" expected = " + expected);
        System.out.println(" result = " + (majorityElement(input) == expected?"true":"false"));

    }

    public static void main(String[] args) {
        unitTestMajorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}, 2);
        unitTestMajorityElement(new int[]{3,2,3}, 3);
    }
}
