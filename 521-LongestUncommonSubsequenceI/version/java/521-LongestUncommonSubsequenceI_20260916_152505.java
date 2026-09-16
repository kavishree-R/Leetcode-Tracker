// Last updated: 9/16/2026, 3:25:05 PM
1import java.util.Arrays;
2
3class Solution {
4    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
5        int[] dp = new int[n];
6        Arrays.fill(dp, Integer.MAX_VALUE);
7        dp[src] = 0;
8
9        for (int i = 0; i <= k; i++) {
10            int[] temp = Arrays.copyOf(dp, n);
11            for (int[] flight : flights) {
12                if (dp[flight[0]] != Integer.MAX_VALUE) {
13                    temp[flight[1]] = Math.min(temp[flight[1]], dp[flight[0]] + flight[2]);
14                }
15            }
16            dp = temp;
17        }
18        
19        return dp[dst] == Integer.MAX_VALUE ? -1 : dp[dst];
20    }
21}