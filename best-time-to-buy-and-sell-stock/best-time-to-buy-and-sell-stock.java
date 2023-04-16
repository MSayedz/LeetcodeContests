class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int sell = Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            sell = Math.min(sell,prices[i]);
            profit = Math.max(profit, prices[i]-sell);
        }
        
        return profit;
    }
}