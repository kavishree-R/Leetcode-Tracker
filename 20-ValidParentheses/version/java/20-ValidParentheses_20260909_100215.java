// Last updated: 9/9/2026, 10:02:15 AM
1class Solution {
2    public int jump(int[] N) {
3        int len = N.length - 1, curr = -1, next = 0, ans = 0;
4        for (int i = 0; next < len; i++) {
5            if (i > curr) {
6                ans++;
7                curr = next;
8            };
9            next = Math.max(next, N[i] + i);
10        };
11        return ans;
12    };
13};