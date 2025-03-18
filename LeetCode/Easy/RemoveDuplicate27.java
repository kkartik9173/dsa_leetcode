package main.java.LeetCode.Easy;

import java.util.List;

public class RemoveDuplicate27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};

        RemoveDuplicate27 rm = new RemoveDuplicate27();
        int result = rm.removeDuplicates(nums, 2);

        System.out.println(result);
    }

    private int removeDuplicates(int[] nums, int val) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        System.out.println(k);
        return k;

    }
}
