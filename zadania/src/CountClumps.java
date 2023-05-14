/*
Array-3 > countClumps
        prev  |  next  |  chance

        Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
        Return the number of clumps in the given array.

        countClumps([1, 2, 2, 3, 4, 4]) → 2
        countClumps([1, 1, 2, 1, 1]) → 2
        countClumps([1, 1, 1, 1, 1]) → 1
*/

import java.util.Arrays;

public class CountClumps {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4};
        int[] nums2 = {1, 1, 2, 1, 1};
        int[] nums3 = {1, 1, 1, 1, 1, 1};
        System.out.println(countClumps(nums));
        System.out.println(countClumps(nums2));
        System.out.println(countClumps(nums3));
    }

    public static int countClumps(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
                if (count == 1) {
                    max++;
                }
            }
            else{count =0;}
        }
        return max;
    }
}
