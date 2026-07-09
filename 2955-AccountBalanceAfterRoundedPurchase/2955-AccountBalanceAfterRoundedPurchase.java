// Last updated: 7/9/2026, 3:06:48 PM
class Solution {
    public int accountBalanceAfterPurchase(int PA) {
        if(PA%10<=4) return 100-(PA/10)*10 ;
        else return 100-((PA/10)+1)*10;      
    }
}