// Last updated: 10/9/2026, 10:24:53 AM
1
2
3class Solution {
4    public int[] findErrorNums(int[] nums) {
5        int dup = -1, missing = -1;
6        
7        for (int i = 1; i <= nums.length; i++) {
8            int count = 0;
9            for (int j = 0; j < nums.length; j++) {
10                if (nums[j] == i) {
11                    count++;
12                }
13            }
14            if (count == 2) {
15                dup = i;
16            } else if (count == 0) {
17                missing = i;
18            }
19        }
20        
21        return new int[] {dup, missing};
22    }
23}
24
25