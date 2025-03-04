package main.java.LeetCode.Medium;

public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {

        int maxSubArraySum = nums[0];
        int current_max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current_max = Math.max(nums[i], nums[i] + current_max);
            maxSubArraySum = Math.max(current_max, maxSubArraySum);
        }

        return maxSubArraySum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums1 = {5,4,-1,7,8};
        MaximumSubarray53 maximumSubarray = new MaximumSubarray53();
        int maxLengthSubArray= maximumSubarray.maxSubArray(nums1);
        System.out.println(maxLengthSubArray);
    }
}
