class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        int mini = prices[0];
        int profit = 0;
        int maxP = 0;
        for(int i=1; i<prices.length; i++)
        {
            mini = Math.min(mini, prices[i]);
            profit = prices[i] - mini;
            maxP = Math.max(maxP, profit);
        }
        return maxP;
    }
}
