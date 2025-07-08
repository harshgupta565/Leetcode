class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int minpurchase = Integer.MAX_VALUE;
        for(int price : prices){
            if(minpurchase > price){
                minpurchase = price;
            }
            else if (price - minpurchase > maxprofit){
                maxprofit =  price - minpurchase ;

            }


        }
        return maxprofit ; 

    }
}