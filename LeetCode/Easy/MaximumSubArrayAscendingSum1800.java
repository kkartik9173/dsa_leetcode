package main.java.LeetCode.Easy;

//        Input: nums = [10,20,30,5,10,50]
//        Output: 65
//        Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
public class MaximumSubArrayAscendingSum1800 {

    private int maximumSubArraySum(int[] nums) {
        int a = 0;
        int subArraySum = nums[0];

        for (int i = 1; i < nums.length; i++){

            if (nums[i] > nums[i - 1]) {
                subArraySum += nums[i];
            } else {
                a = Math.max(a, subArraySum);
                subArraySum = nums[i];
            }

        }

        return Math.max(a, subArraySum);
    }

    public static void main(String[] args) {
        int[] intArray = {10,20,30,78,5,10,50};
        MaximumSubArrayAscendingSum1800 maximumSubArrayAscendingSum = new MaximumSubArrayAscendingSum1800();
        int sum = maximumSubArrayAscendingSum.maximumSubArraySum(intArray);
            System.out.println(sum);
    }
}
