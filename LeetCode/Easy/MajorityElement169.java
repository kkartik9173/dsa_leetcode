package main.java.LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int majorityNumber = 0;
        int count = 0;
        for (int n: nums) {
            if(hMap.containsKey(n))
                hMap.put(n, hMap.get(n)+1);
            else
                hMap.put(n, 1);

            if(hMap.get(n) > count){
                count = hMap.get(n);
                majorityNumber = n;
            }

        }

        return majorityNumber;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,1,2};


        MajorityElement169 m = new MajorityElement169();
        int result = m.majorityElement(nums);
        System.out.println(result);

    }

}
