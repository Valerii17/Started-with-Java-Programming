package org.example.lesson2.classwork;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] res = runningSum(arr);
        for (int n : res) {
            System.out.print(n + ", ");
        }
    }

    /**
     * @param nums array of nums
     ** @return sum of each previous numbers
     * * @apiNote Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * * https://leetcode.com/problems/running-sum-of-1d-array/
     */
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
