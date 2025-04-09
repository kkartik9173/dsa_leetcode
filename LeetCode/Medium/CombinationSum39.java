package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> pickList = new ArrayList<>();

        temp(candidates, target, finalList, pickList, 0);
        return finalList;
    }

    static void temp(int[] candidates, int target, List<List<Integer>> finalList, List<Integer> pickList, int i) {
        if(target == 0){
            finalList.add(new ArrayList<>(pickList));
            return;
        }

        if(i == candidates.length || target < 0) return;
        pickList.add(candidates[i]);
        temp(candidates, (target - candidates[i]),finalList, pickList, i);
        pickList.remove(pickList.size()-1);
        temp(candidates,target,finalList,pickList,i+1);
    }

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        CombinationSum39 cmbSum = new
                CombinationSum39();

        List<List<Integer>> res = cmbSum.combinationSum(candidates, target);
        System.out.println(res);
    }
}
