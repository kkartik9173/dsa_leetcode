package main.java.LeetCode.Easy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//        Input: nums = [8,1,2,2,3]
//        Output: [4,0,1,1,3]
//        Explanation:
//        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
//        For nums[1]=1 does not exist any smaller number than it.
//        For nums[2]=2 there exist one smaller number than it (1).
//        For nums[3]=2 there exist one smaller number than it (1).
//        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
public class SmallerNumberArray1365 {


    public int[] smallerNumberArray(int[] nums) {
        int length = nums.length;
        int[] resultArray = new int[length];

        //Ok
        for (int i = 0; i < length ; i++) {
            for (int j = 0; j < length ; j++) {
                if((i != j) && nums[i] > nums[j]){
                    resultArray[i]++;
                }
            }
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int[] intArray = {8,1,2,2,3};
        SmallerNumberArray1365 smallerNumberArray1365 = new SmallerNumberArray1365();
        int[] resultArray = smallerNumberArray1365.smallerNumberArray(intArray);
        System.out.println(smallerNumberArray1365.smallerNumberArray(intArray));
        for (int i: resultArray){
            System.out.println(i);
        }

    }
}
