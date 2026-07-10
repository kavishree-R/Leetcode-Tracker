// Last updated: 7/10/2026, 9:30:44 PM
1class Solution {
2    public int numTrees(int n) {
3        int dp[] = new int[n + 1];
4        dp[0] = dp[1] = 1;
5
6        for(int i = 2; i <= n; i++) {
7            for(int j = 1; j <= i; j++) dp[i] += dp[j - 1] * dp[i - j];
8        }
9        return dp[n];
10    }
11}