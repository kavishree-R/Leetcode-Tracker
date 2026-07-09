// Last updated: 7/9/2026, 3:09:05 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even=0,odd=0;
        for(int p:position){
            if(p%2==0) even++;
            else odd++;
        }
        return even<odd?even:odd;
    }
}