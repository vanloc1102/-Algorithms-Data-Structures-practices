package org.example.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _496_Next_Greater_Element_I {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            nextGreaterMap.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        int[] result = new int[nums1.length];
        for (int i = nums1.length - 1; i >= 0; i--) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {3,1,2,4};
        int[] nums3 = nextGreaterElement(nums1, nums2);
        System.out.println(nums3);
    }

//    Example 1:
//    Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//    Output: [-1,3,-1]
//    Explanation: The next greater element for each value of nums1 is as follows:
//            - 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//            - 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//            - 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
//    Example 2:
//    Input: nums1 = [2,4], nums2 = [1,2,3,4]
//    Output: [3,-1]
//    Explanation: The next greater element for each value of nums1 is as follows:
//            - 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
//            - 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so the answer is -1.

}
