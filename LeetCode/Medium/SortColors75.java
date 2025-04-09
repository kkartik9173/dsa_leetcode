package main.java.LeetCode.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortColors75 {

    public void sortColors(int[] nums) {
        Map<Integer, Integer> hMap = new HashMap<>();
        hMap.put(0,0);
        hMap.put(1,0);
        hMap.put(2,0);

        for (int num : nums) {
            hMap.put(num, hMap.get(num) + 1);
        }
        System.out.println(hMap);

        int index = 0;
        for (int color = 0; color < 3; color++) {
            int freq = hMap.get(color);
            for(int i=0; i<freq; i++){
                nums[index] = color;
                index++;
            }
          ;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        SortColors75 lwca = new
                SortColors75();
        lwca.sortColors(nums);

    }
}
