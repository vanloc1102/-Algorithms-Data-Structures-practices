package org.example.prefix_sum;

public class _1732_Find_the_Highest_Altitude {

    public static int largestAltitude(int[] gain) {
        int largest = 0;
        int currentLargest = largest;
        for (int i = 0; i < gain.length; i++) {
            largest+=gain[i];
            if (largest>currentLargest)
                currentLargest = largest;
        }
        return currentLargest;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

//    Example 1:
//
//    Input: gain = [-5,1,5,0,-7]
//    Output: 1
//    Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
//    Example 2:
//
//    Input: gain = [-4,-3,-2,-1,4,3,2]
//    Output: 0
//    Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
}
