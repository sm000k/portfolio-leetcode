//package com.codingbat.warmup;

public class Array667 {

    public static int array667(int[] nums) {
        int flag = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6 && flag == 0) {
                flag = 1;
            } else {
                if (nums[i] == 6 && flag == 1) {
                    count += 1;
                } else {
                    if (nums[i] == 7 && flag == 1) {
                        count++;
                    }
                    flag = 0;
                }
            }
        }
        return count;
    }
    public int array667Simpler(int[] nums) {
        int count = 0;
        // Note: iterate to length-1, so can use i+1 in the loop
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int array667 = array667(new int[]{3, 6, 6, 7});
        System.out.println(array667);
    }

}
