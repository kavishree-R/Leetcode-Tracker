// Last updated: 7/9/2026, 3:11:30 PM
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n<=1)
            return nums[0];
        int[] a1=new int[n-1];
        int[] a2=new int[n-1];
        for(int i=0;i<n-1;i++){
            a1[i]=nums[i];
        }
         for(int i=1;i<n;i++){
            a2[i-1]=nums[i];
        }
        int[] dp=new int[n] ;
        Arrays.fill(dp, -1);
        int ans1=helper(a1,a1.length-1,dp);
        Arrays.fill(dp, -1);
        int ans2=helper(a2,a2.length-1,dp);
        return Math.max(ans1,ans2);
    }
    
        int helper(int nums[],int i,int[] dp) {
            if(i<0) {
                return 0;
            }
            if(dp[i]!=-1) {
                return dp[i];
            }
            int take=nums[i]+helper(nums,i-2,dp);
            int not=0+helper(nums,i-1,dp);
            dp[i]=Math.max(take,not);
            return dp[i];
    }
}