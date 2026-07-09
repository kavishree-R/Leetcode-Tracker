// Last updated: 7/9/2026, 3:11:47 PM
class Solution {
    public int hammingWeight(int n) {
        int count =0;
        while(n!=0){
            count+=n&1;
            n>>>=1;

        }
        return count++;
            
    }
}