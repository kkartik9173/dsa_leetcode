package main.java.LeetCode.Easy;

public class BuySellStock121 {

    public int maxProfit(int[] prices) {
          //My code
//        int length = prices.length -1;
//        int maxProfit = 0;
//        for (int i = 0; i < length; i++) {
//            for (int j = length; i < j; j--) {
//                int currentDifference = prices[j]-prices[i];
//                if(maxProfit < currentDifference)
//                    maxProfit= currentDifference;
//            }
//        }
//
//        return maxProfit;

        // Initialize 'maxProfit' to 0, which is the minimum profit that can be made.
        int maxProfit = 0;

        // Assume the first price is the minimum buying price.
        int minPrice = prices[0];

        // Loop through all the prices to find the maximum profit.
        for (int price : prices) {
            // Calculate the maximum profit by comparing the current 'maxProfit'
            // with the difference of the current price and the 'minPrice'.
            maxProfit = Math.max(maxProfit, price - minPrice);

            // Update the 'minPrice' if a lower price is found.
            minPrice = Math.min(minPrice, price);
        }

        // Return the maximum profit that can be achieved.
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices1 = {7,6,4,3,1};

        BuySellStock121 buySellStock = new BuySellStock121();
        int maxProfit = buySellStock.maxProfit(prices);
        System.out.println("maxProfit "+ maxProfit);
    }
}
