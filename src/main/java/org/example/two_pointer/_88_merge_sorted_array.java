package org.example.two_pointer;

import java.util.Arrays;

public class _88_merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int end = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[end] = nums1[i];
                end--;
                i--;
            }
            else{
                nums1[end--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[end--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
//        int[] nums1 = { 1,2,3,0,0,0 };
//        int[] nums2 = { 2,5,6 };
        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        merge(nums1, 0, nums2, 1);
        System.out.println("Hello, World! " + Arrays.toString(nums1));
    }
}

//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
//        Example 2:
//
//Input: nums1 = [1], m = 1, nums2 = [], n = 0
//Output: [1]
//Explanation: The arrays we are merging are [1] and [].
//The result of the merge is [1].
//Example 3:
//
//Input: nums1 = [0], m = 0, nums2 = [1], n = 1
//Output: [1]
//Explanation: The arrays we are merging are [] and [1].
//The result of the merge is [1].
//Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.