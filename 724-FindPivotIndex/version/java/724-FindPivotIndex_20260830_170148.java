// Last updated: 8/30/2026, 5:01:48 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3      if(nums.length == 0) return - 1;
4      int leftSum = 0, rightSum = 0;
5      for(int num : nums) 
6          rightSum += num;
7
8      for(int i = 0; i < nums.length; i ++) {
9        rightSum -= nums[i];
10        if(rightSum == leftSum) return i;
11        leftSum += nums[i];
12      }
13      return - 1;
14    }
15}