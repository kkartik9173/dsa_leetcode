package main.java.LeetCode.Medium;

public class CoinChange322 {
    public int coinChange(int[] coins, int amount) {

//        // dp[i] := the minimum number of coins to make up i, check this
//        int[] dp = new int[amount + 1];
//        Arrays.fill(dp, 1, dp.length, amount + 1);
//
//        for (final int coin : coins)
//            for (int i = coin; i <= amount; ++i)
//                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
//
//        return dp[amount] == amount + 1 ? -1 : dp[amount];

        //check edge case
        if(amount < 1) return 0;

        //create DP array
        int[] minimumCoinsDP = new int[amount+1];

        for (int i = 1; i <= amount; i++) {
            minimumCoinsDP[i] = Integer.MAX_VALUE;
            System.out.println("minimumCoinsDP[i] " +minimumCoinsDP[i]);

            //Try each coin
            for (int coin:coins) {

                if(coin <= i && minimumCoinsDP[i-coin] != Integer.MAX_VALUE){
                    minimumCoinsDP[i]= Math.min(minimumCoinsDP[i], 1 + minimumCoinsDP[i - coin]);
                }
            }
        }

        if (minimumCoinsDP[amount] == Integer.MAX_VALUE)
            return -1;

        return minimumCoinsDP[amount];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5};
        int amount = 11;
        CoinChange322 coinChange322 = new CoinChange322();
        System.out.println(coinChange322.coinChange(nums, amount));
        
    }


}
