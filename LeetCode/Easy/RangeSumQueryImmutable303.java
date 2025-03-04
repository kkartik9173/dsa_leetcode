package main.java.LeetCode.Easy;

import java.util.HashMap;

public class RangeSumQueryImmutable303 {

    private final HashMap<Integer, Integer> allIndicesArraySum = new HashMap<>();
    private void NumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            allIndicesArraySum.put(i, sum);
        }
    }

    public int sumRange(int left, int right) {

        return left > 0 ? allIndicesArraySum.get(right) -  allIndicesArraySum.get(left - 1)
                :  allIndicesArraySum.get(right);
    }

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable303 rangeSumQueryImmutable = new RangeSumQueryImmutable303();
        rangeSumQueryImmutable.NumArray(nums);
        int rangeSum = rangeSumQueryImmutable.sumRange(0,4);
        System.out.println("rangeSum " + rangeSum);
    }
}

