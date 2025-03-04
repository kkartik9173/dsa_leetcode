package main.java.LeetCode.Medium;

public class MinimumSizeSubarraySum209 {

    //use 2Pointer and sliding window pattern to reach to the result.
    private int getMinSizeArray(int target, int[] nums) {
        int minimumWindowLength = Integer.MAX_VALUE;
        int lowPointer = 0;
        int highPointer = 0;
        int currentSum = 0;
        
        while (highPointer < nums.length){
            
            currentSum+=nums[highPointer];
            highPointer++;
            
            while(currentSum >= target ){
                int currentSizeWindow = highPointer - lowPointer;
                minimumWindowLength = Math.min(currentSizeWindow, minimumWindowLength);

                currentSum-=nums[lowPointer];
                if(lowPointer < nums.length -1)
                    lowPointer++;
            }
        }
        
        return minimumWindowLength == Integer.MAX_VALUE ? 0 : minimumWindowLength;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int[] nums1 = {1,1,1,1,1,1,1,1};
        int[] nums2 = {1,4,4};
        int target = 4;
        MinimumSizeSubarraySum209 minimumSizeSubarraySum209 = new MinimumSizeSubarraySum209();
        int len = minimumSizeSubarraySum209.getMinSizeArray(target, nums);
        System.out.println(len);


    }

}
