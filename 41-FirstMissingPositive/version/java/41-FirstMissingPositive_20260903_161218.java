// Last updated: 9/3/2026, 4:12:18 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        int l = nums.length;
4        int bigNum = l + 1;
5        int missingNum = 1;
6        
7        
8        for (int i = 0; i < l; i++)
9            if (nums[i] <= 0)
10                nums[i] = bigNum;
11        
12        
13        for (int num : nums) {
14            int idx = Math.abs(num) - 1;
15            
16            
17            if (idx < l)
18                nums[idx] = Math.abs(nums[idx]) * -1;
19        }
20        
21        
22        for (int num : nums) {
23            if (num > 0)
24                return missingNum;
25            
26            
27            missingNum++;
28        }
29        
30        
31        return missingNum;
32    }
33}