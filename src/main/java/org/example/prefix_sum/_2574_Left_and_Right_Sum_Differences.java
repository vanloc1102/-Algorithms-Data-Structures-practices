package org.example.prefix_sum;

import java.util.Arrays;

public class _2574_Left_and_Right_Sum_Differences {

    public static int[] leftRightDifference(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            left[i] = leftSum;
            leftSum += nums[i];
        }
        for (int i = nums.length - 1 ; i >= 0 ; i--) {
            right[i] = rightSum;
            rightSum += nums[i];
        }
        for (int i=0; i<nums.length; i++){
            left[i] = Math.abs(left[i] - right[i]);
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,8,3};
        Arrays.toString(leftRightDifference(nums));
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
//    Example 1:
//    Input: nums = [10,4,8,3]
//    Output: [15,1,11,22]
//    Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
//    The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
//
//    Example 2:
//    Input: nums = [1]
//    Output: [0]
//    Explanation: The array leftSum is [0] and the array rightSum is [0].
//    The array answer is [|0 - 0|] = [0].
}
