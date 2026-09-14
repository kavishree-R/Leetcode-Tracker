// Last updated: 9/14/2026, 6:11:22 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4
5        int j = n - 1, i = j - 1;
6
7        while(j > 0 && i > -1){
8            if(nums[i] >= j - i) j = i;
9
10            i--;
11        }
12
13        return j == 0;
14    }
15}