package main.java.LeetCode.Medium;

import java.util.List;
import java.util.*;

public class LongestMountainArray845 {
    private int getLongestMountain(int[] nums) {
        int count = 0;

        for (int i = 0; i + 1 < nums.length;) {
            while (i + 1 < nums.length && nums[i] == nums[i + 1])
                ++i;

            int increasing = 0;
            int decreasing = 0;

            while (i + 1 < nums.length && nums[i] < nums[i + 1]) {
                ++increasing;
                ++i;
            }

            while (i + 1 < nums.length && nums[i] > nums[i + 1]) {
                ++decreasing;
                ++i;
            }

            if (increasing > 0 && decreasing > 0)
                count = Math.max(count, increasing + decreasing + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,4,7,3,2,5};//5
        int[] nums1 = {2,2,2}; //0
        int[] nums2 = {0,1,2,3,4,5,4,3,2,1,0};  //11

        LongestMountainArray845 longestMountainArray = new LongestMountainArray845();
        System.out.println(longestMountainArray.getLongestMountain(nums));
    }


}
