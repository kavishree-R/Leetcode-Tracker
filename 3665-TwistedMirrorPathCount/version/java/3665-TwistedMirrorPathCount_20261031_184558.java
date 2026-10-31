// Last updated: 10/31/2026, 6:45:58 PM
1class Solution {
2    public int uniquePaths(int[][] grid) {
3        final int MOD = 1_000_000_007;
4        int m = grid.length, n = grid[0].length;
5        int[] right = new int[n];
6        int[] down = new int[n];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                if (i == 0 && j == 0) {
11                    right[0] = 1;
12                    down[0] = 0;
13                    continue;
14                }
15                int fromTop = 0;
16                if (i > 0) {
17                    fromTop = grid[i - 1][j] == 0
18                            ? (right[j] + down[j]) % MOD
19                            : right[j];
20                }
21                int fromLeft = 0;
22                if (j > 0) {
23                    fromLeft = grid[i][j - 1] == 0
24                            ? (right[j - 1] + down[j - 1]) % MOD
25                            : down[j - 1];
26                }
27                down[j] = fromTop;
28                right[j] = fromLeft;
29            }
30        }
31        return (right[n - 1] + down[n - 1]) % MOD;
32    }
33}