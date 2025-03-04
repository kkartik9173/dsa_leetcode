package main.java.LeetCode.Easy;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumArray448 {
    private List<Integer> disappearedNumber(int[] nums) {
        //Ok Sol
//        int length= nums.length;  //2
//        Arrays.sort(nums);
//
//        for (int i = 0; i < length; i++) {
//           if(nums[i] != i)
//               return nums[i]-1;
//        }
//        return length;

        //Best Solution
        List<Integer> lInt = new ArrayList<>();
        int n=nums.length;
        int[] hash=new int[n+1];
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
        }
        for(int j=1;j<n+1;j++){
            if(hash[j]==0){
                lInt.add(j);
            }
        }
        return lInt;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        DisappearedNumArray448 DisappearedNumArray448 = new DisappearedNumArray448();
        System.out.println("missing number is "+ DisappearedNumArray448.disappearedNumber(nums));
        }

}
