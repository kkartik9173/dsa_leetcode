package main.java.LeetCode.Medium;

import java.util.Arrays;

public class FirstLastPositionInSortedArray34 {

    public int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        return new int[] { first, last };
    }

    private int findPosition(int[] nums, int target, boolean findFirst) {
        int left = 0;
        int right = nums.length - 1;
        int pos = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                pos = mid;
                if (findFirst)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return pos;
    }

    public static void main(String[] args) {

    int[] inputArray = {5,6,7,7,8,8,11}; int target=8;
    int[] inputArray1 = {}; int target1=0;
    FirstLastPositionInSortedArray34 firstLastPosition
            = new FirstLastPositionInSortedArray34();
    int[] result = firstLastPosition.searchRange(inputArray,target);
        System.out.println(Arrays.toString(result));

    }
}
