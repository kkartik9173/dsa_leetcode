package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lInt = new ArrayList<>();

        backTrackSet(nums, lInt, new ArrayList<>(), 0);

        return lInt;
    }

    private void backTrackSet(int[] nums, List<List<Integer>> lInt, List<Integer> temp , int start) {
        lInt.add(new ArrayList<>(temp));
        System.out.println("lInt:- " + lInt);
        for (int i= start; i< nums.length; i++){
            temp.add(nums[i]);
            backTrackSet(nums, lInt, temp, i+1);
            temp.remove(temp.size()-1);
        }


    }

    public static void main(String[] args) {
        int[] num = {1,2,3};

        SubSet78 subSet = new SubSet78();
        subSet.subsets(num);
    }

}
