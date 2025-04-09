package main.java.LeetCode.Medium;

import main.java.LeetCode.Easy.MaximumValueOfOrderedTriplets2873;

public class MaximumValueOfOrderedTriplets2874 {

    public long maximumTripletValue(int[] nums) {

        long res = 0, maxa = 0, maxab = 0;
        for (int a : nums) {
            res = Math.max(res, 1L * maxab * a);
            maxab = Math.max(maxab, maxa - a);
            maxa = Math.max(maxa, a);
        }
        return res;

    }
    public static void main(String[] args) {

        int[] nums = {12, 6, 1, 2, 7};
        MaximumValueOfOrderedTriplets2874 maxTriplet = new
                MaximumValueOfOrderedTriplets2874();

        long maxTiplet = maxTriplet.maximumTripletValue(nums);
        System.out.println(maxTiplet);
    }
}
