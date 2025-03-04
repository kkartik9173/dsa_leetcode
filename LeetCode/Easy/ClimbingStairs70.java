package main.java.LeetCode.Easy;

import com.sun.security.jgss.GSSUtil;

public class ClimbingStairs70 {

    private int getStepWays(int n) {

        // we have 2 ways 1step and 2 steps, so for n=2 we can have
        //for n = 2  we can have 1+1 or 2
        //for n=3 we can have 1+1+1 or 1+2 or 2+1
        if(n==1) return 1;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i]= dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 8;
        ClimbingStairs70 climbingStairs70 = new ClimbingStairs70();
        System.out.println(climbingStairs70.getStepWays(n));
    }


}
