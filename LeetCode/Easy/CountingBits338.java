package main.java.LeetCode.Easy;

import java.util.Arrays;

public class CountingBits338 {

    private int getOnesCount(String binaryString) {
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int[] countBits(int n) {

        int[] ans = new int[n+1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            String binaryString = Integer.toBinaryString(i);
            int count_ones = getOnesCount(binaryString);
            ans[i] = count_ones;
        }

        return ans;
    }



    public static void main(String[] args) {

        CountingBits338 countingBits338 = new CountingBits338();
//        int[] arr= countingBits338.countBits(5);
//        for (int i:arr) {
//            System.out.println(i);
//        }
//        System.out.println("Using toString " +Arrays.toString(arr));

        CountingBits338 countingBits_AnotherApproach = new CountingBits338();
        countingBits_AnotherApproach.newApproach(5);
    }

    private int[] newApproach(int n) {
        int res[]=new int[n+1];
        for(int i=1;i<=n;i++){
            res[i]=res[i/2]+i%2;
            System.out.println(res[i]);
        }
        return res;

    }
}
