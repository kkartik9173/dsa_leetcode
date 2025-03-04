package main.java.LeetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class Combination77 {

    public List<List<Integer>> combinations(int n, int k) {
        if(k>n) return new ArrayList<>();

        List<List<Integer>> lInt = new ArrayList<>();

        backTrackComb(n, k, lInt, new ArrayList<>(), 1);
        System.out.println(lInt);
        return lInt;
    }

    private void backTrackComb(int n, int k, List<List<Integer>> lInt, List<Integer> temp, int i) {

        if(k == 0){
            lInt.add(new ArrayList<>(temp));
            System.out.println("lInt "+ lInt);
        }

        for(int x=i; x <= n; x++){
            temp.add(x);
            backTrackComb(n, k-1, lInt, temp, x+1);
            temp.remove(temp.size() -1);
        }
    }

    public static void main(String[] args) {

        Combination77 combination = new Combination77();
        combination.combinations(4, 2);
    }

}
