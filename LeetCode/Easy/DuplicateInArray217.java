package main.java.LeetCode.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateInArray217 {

    public boolean containsDuplicate(int[] nums) {
        //int length = nums.length;
        //can work
//        for (int i = 0; i < nums.length -1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] == nums[j])
//                    return true;
//            }
//        }
//
//        for (var entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }

        //Ok
        /*
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer intNum: nums) {

             if(map.containsKey(intNum)){
                    return true;
                } else
                    map.put(intNum, 1);
        }
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        */

        //Best
        Set<Integer> set = new HashSet<>();
        for (Integer intNum: nums) {
            if(!set.add(intNum))
                return true;
        }

        return false;
    };

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        DuplicateInArray217 duplicateInArray217 = new DuplicateInArray217();
        System.out.println("Is array contains diuplicate:- "+ duplicateInArray217.containsDuplicate(nums));

    }
}
