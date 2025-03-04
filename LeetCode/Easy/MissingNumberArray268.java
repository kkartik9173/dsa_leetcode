package main.java.LeetCode.Easy;

import java.util.Arrays;

public class MissingNumberArray268 {

    private int missingNumber(int[] nums) {
        //Ok Sol
//        int length= nums.length;  //2
//        Arrays.sort(nums);
//        for (int i = 0; i < length; i++) {
//           if(nums[i] != i)
//               return nums[i]-1;
//        }
//        return length;

        //Best Solution
        int n=nums.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;

        }
        for(int j=0;j<n+1;j++){
            if(hash[j]==0){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1,6,8,5,2,4};
        MissingNumberArray268 missingNumberArray268 = new MissingNumberArray268();
        System.out.println("missing number is "+ missingNumberArray268.missingNumber(nums));

    }


}
