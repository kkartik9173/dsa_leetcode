package main.java.LeetCode.Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThreeClosestSum16 {


    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        ThreeClosestSum16 threeClosestSum16
                        =new ThreeClosestSum16();

        int result = threeClosestSum16.threeClosestSum(nums, 1);
        System.out.println(result);

    }

    private int threeClosestSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int closestSum = 0;
        for (int i = 0; i < n-2; i++) {
            int low = i+1;
            int high = n-1;
            while(low<high){
                int temp=nums[i]+nums[low]+nums[high];
                if(Math.abs(target-temp)<minDiff){
                    closestSum=temp;
                    minDiff=Math.abs(target-temp);
                }
                if(temp==target){
                    return target;
                }
                else if(temp>target){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return closestSum;
    }
}



