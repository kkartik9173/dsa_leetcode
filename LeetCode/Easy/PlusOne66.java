package main.java.LeetCode.Easy;

import java.util.Arrays;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        if(digits.length == 0 ) {
            return digits;
        }

        for (int i = digits.length -1; i >=0; i--) {
            if(digits[i] < 9 ) {
                digits[i]++;
                return digits;
            } digits[i] = 0;
        }
        digits = new int[digits.length+1];
        System.out.println("first "+ Arrays.toString(digits));
        digits[0]=1;

        System.out.println("Second " + Arrays.toString(digits));


        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,9};
        PlusOne66 plusOne = new PlusOne66();
        int[] resultArr = plusOne.plusOne(digits);
        System.out.println(Arrays.toString(resultArr));
    }
}
