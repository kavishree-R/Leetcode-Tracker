// Last updated: 7/9/2026, 3:12:56 PM
class Solution {
    public int singleNumber(int[] nums) {
       int xor=0;
       for(int i=0;i<nums.length;i++){
        xor=xor^nums[i];
       }
       return xor;
        
    }
}