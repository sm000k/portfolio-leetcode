package com.codingbat.warmup;

public class noTriples {
    public static boolean noTriples(int[] nums) {
        if (nums.length < 3) return true;

        int flag = -1;
        int number = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == number) {
                if (flag == -1) {
                    flag = 0;
                    continue;
                }
                if (flag == 0) {
                    flag = 1;
                    continue;
                }

                if (flag == 1) {
                    flag = 2;
                    return false;
                }
            } else {
                number = nums[i];
                flag = 0;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        boolean b = noTriples(new int[]{1, 1, 2, 2, 2, 1});
        System.out.println(b);
    }
}
