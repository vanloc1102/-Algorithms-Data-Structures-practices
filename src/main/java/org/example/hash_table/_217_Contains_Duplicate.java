package org.example.hash_table;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _217_Contains_Duplicate {

//    public static boolean containsDuplicate(int[] nums) {
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) return true;
//            map.put(nums[i], i);
//        }
//        return false;
//    }
public static boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] == nums[i + 1]) {
            return true;
        }
    }
    return false;
}

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        containsDuplicate(nums);
    }
//
//    Example 1:
//    Input: nums = [1,2,3,1]
//    Output: true
//    Explanation:
//    The element 1 occurs at the indices 0 and 3.
//
//    Example 2:
//    Input: nums = [1,2,3,4]
//    Output: false
//    Explanation:
//    All elements are distinct.
//
//    Example 3:
//    Input: nums = [1,1,1,3,3,4,3,2,4,2]
//    Output: true
}
