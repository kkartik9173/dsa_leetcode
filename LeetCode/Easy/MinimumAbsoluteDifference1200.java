package main.java.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference1200 {

    private List<List<Integer>> minimumAbsDiff(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        System.out.println(min_diff);

        for (int i = 1; i < arr.length; i++) {
            min_diff = Math.min( arr[i] - arr[i-1], min_diff);
        }

        for (int i = 1; i < arr.length; i++) {
            if(min_diff == arr[i] - arr[i-1]  ){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);

                result.add(pair);
            }

        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {4,2,1,3};
        MinimumAbsoluteDifference1200 minimumAbsoluteDifference1200
                = new MinimumAbsoluteDifference1200();
        System.out.println(minimumAbsoluteDifference1200.minimumAbsDiff(arr));
    }


}
