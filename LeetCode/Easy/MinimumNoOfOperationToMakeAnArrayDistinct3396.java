package main.java.LeetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumNoOfOperationToMakeAnArrayDistinct3396 {

    public int minimumOperations(int[] nums) {

        int cnt = 0, temp;
        List<Integer> list = new ArrayList<>();
        for (int n : nums)
            list.add(n);
        while (true) {
            HashMap<Integer, Integer> mpp = new HashMap<>();
            temp = 0;
            for (int num : list)
                if (mpp.put(num, mpp.getOrDefault(num, 0) + 1) != null && mpp.get(num) == 2)
                    temp++;
            if (temp == 0)
                break;
            int removeCount = Math.min(3, list.size());
            for (int i = 0; i < removeCount; i++)
                list.remove(0);
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] num = {2,2,13};
        MinimumNoOfOperationToMakeAnArrayDistinct3396 min = new
                MinimumNoOfOperationToMakeAnArrayDistinct3396();

        int result = min.minimumOperations(num);
        System.out.println(result);

    }
}
