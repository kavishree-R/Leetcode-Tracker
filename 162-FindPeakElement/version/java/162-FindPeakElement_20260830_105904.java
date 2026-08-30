// Last updated: 8/30/2026, 10:59:04 AM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int n = nums.length;
4
5        if (n == 1) return 0;
6
7        int l = 0;
8        int r = n - 1;
9
10        while (l <= r) {
11            int mid = l + (r - l) / 2;
12            
13            boolean leftOk = (mid == 0) || (nums[mid] > nums[mid - 1]);
14            boolean rightOk = (mid == n - 1) || (nums[mid] > nums[mid + 1]);
15
16            if (leftOk && rightOk) {
17                return mid;
18            }
19
20            
21            if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
22                l = mid + 1;
23            } else {
24                r = mid - 1;
25            }
26        }
27
28        return -1;
29    }
30}