package example.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/search-insert-position/description/
//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [1,3,5,6], target = 5
//Output: 2
//Example 2:
//
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Example 3:
//
//Input: nums = [1,3,5,6], target = 7
//Output: 4
//
//
//Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//nums contains distinct values sorted in ascending order.
//        -104 <= target <= 104
public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        return searchInRange(0, nums.length - 1, target, nums);
    }

    public static int searchInRange(int leftPosition, int rightPosition, int target, int[] nums) {
        if (leftPosition > rightPosition) {
            return leftPosition;
        }
        int midPosition = rightPosition - (rightPosition - leftPosition) / 2;
        if (nums[midPosition] == target) {
            return midPosition;
        }
        if (target < nums[midPosition]) {
            return searchInRange(leftPosition, midPosition - 1, target, nums);
        } else {
            return searchInRange(midPosition + 1, rightPosition, target, nums);
        }
    }
    static void printout(int[] nums, int target){
        System.out.print("nums = " + Arrays.toString(nums));
        System.out.print(" target = " + target);
        System.out.println(" looked position:" + searchInsert(nums, target));
    }
    public static void main(String[] args) {


        int[] nums = {2, 5, 6, 8, 9, 10};
        int target = 5;
        printout(nums,target);

        nums = new int[]{1, 3, 5, 6};
        target = 5;
        printout(nums,target);

        nums = new int[]{1, 3, 4, 5, 6, 7, 8, 9, 10};
        target = 2;
        printout(nums,target);

        nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        target = 11;
        printout(nums,target);

    }
}
