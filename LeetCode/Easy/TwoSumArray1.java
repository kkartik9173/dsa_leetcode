package main.java.LeetCode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSumArray1 {

    public int[] twoSum(int[] nums, int target) {
        int[] resultArray = new int[2];
        //Ok
//        for(int i =0; i< nums.length - 1; i++){
//            for (int j = i+1; j < nums.length; j++) {
//                if(target == (nums[i] + nums[j])){
//                    resultArray[0]= i;
//                    resultArray[1]= j;
//                }
//            }
//        }
        //good
        for(int i =0; i< nums.length-1; i++){
            int temp = target - nums[i];
            for (int j = nums.length - 1; j > i; j--) {
                if(nums[j] == temp){
                    resultArray[0]= i;
                    resultArray[1]= j;

                    return resultArray;
                }
            }
        }

//        Map<Integer, Integer> numMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (numMap.containsKey(complement)) {
//                System.out.println("numMap.containsKey(complement) "+ numMap.get(complement));
//                return new int[] {numMap.get(complement), i};
//            }
//            numMap.put(nums[i], i);
//            for (var entry : numMap.entrySet()) {
//                System.out.println(entry.getKey() + ":" + entry.getValue());
//            }
//        }

        return resultArray;
    }
    public static void main(String[] args) {
        int[] intArray = {2,11,8,6,7,1,5};
        int target = 11;
        TwoSumArray1 twoSumArray1 = new TwoSumArray1();
        System.out.println(twoSumArray1.twoSum(intArray,target));
        for (int i: twoSumArray1.twoSum(intArray,target)){
            System.out.println(i);
        }

    }
}
