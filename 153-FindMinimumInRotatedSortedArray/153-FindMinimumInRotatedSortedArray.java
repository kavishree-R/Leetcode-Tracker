// Last updated: 7/9/2026, 3:12:32 PM
class Solution {
    public int findMin(int[] nums) {
        int left=0,right=nums.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[right]) {
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return nums[left];
        
    }
}