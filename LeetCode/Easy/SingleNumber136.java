package main.java.LeetCode.Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SingleNumber136 {

    private int getSingleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
                set.remove(num);
        }
        System.out.println("set "+ set);
        return set.iterator().next();

//        int value=0;
//        for (int i = 0; i < nums.length; i++) {
//            value = value^nums[i];
//            System.out.println("value:-" + value);
//        }
//       return value;
    }


    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        SingleNumber136 singleNumber136 = new SingleNumber136();
        System.out.println(singleNumber136.getSingleNumber(nums));
    }

}
