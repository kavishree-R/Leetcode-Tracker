// Last updated: 9/16/2026, 2:38:51 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int nmax=nums[n-1]*nums[0]*nums[1];
6        int pmax=nums[n-1]*nums[n-2]*nums[n-3];
7        return Math.max(nmax, pmax);
8    }
9}