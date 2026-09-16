// Last updated: 9/16/2026, 2:22:10 PM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums); 
4        int j = 0, ans = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            while (nums[i] - nums[j] > 1)
8                j++;
9
10            if (nums[i] - nums[j] == 1)
11                ans = Math.max(ans, i - j + 1);
12        }
13
14        return ans;
15    }
16}