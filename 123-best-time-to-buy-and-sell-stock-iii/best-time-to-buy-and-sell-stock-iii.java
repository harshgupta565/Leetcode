class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;
        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;
        
        for (int price : prices) {
            buy1 = Math.max(buy1, -price);         // Buy first stock
            sell1 = Math.max(sell1, buy1 + price); // Sell first stock
            buy2 = Math.max(buy2, sell1 - price);  // Buy second stock using profit from first
            sell2 = Math.max(sell2, buy2 + price); // Sell second stock
        }
        
        return sell2;
    }
}
