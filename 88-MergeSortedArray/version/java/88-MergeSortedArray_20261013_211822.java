// Last updated: 10/13/2026, 9:18:22 PM
1class Solution {
2   public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int p1 = m - 1;
4        int p2 = n - 1;
5        int pMerge = m + n - 1;
6        
7        while (p2 >= 0) {
8            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
9                nums1[pMerge--] = nums1[p1--];
10            } else {
11                nums1[pMerge--] = nums2[p2--];
12            }
13        }
14    }
15}
16