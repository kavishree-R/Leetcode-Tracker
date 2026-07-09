// Last updated: 7/9/2026, 3:13:10 PM
class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minBuyPrice=prices[0];
        for(int i=1;i<prices.length;i++){
            int sellPrice=prices[i];
            if(sellPrice>minBuyPrice){
                int profit=sellPrice-minBuyPrice;
                if(profit>maxp)maxp=profit;

            }else{
                minBuyPrice=sellPrice;
            }
        }
        return maxp;
       
        
    }
}