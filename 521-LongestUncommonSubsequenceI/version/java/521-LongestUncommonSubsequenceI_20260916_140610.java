// Last updated: 9/16/2026, 2:06:10 PM
1class Solution {
2    int[] DIR = new int[]{0, 1, 0, -1, 0};
3    public int[][] updateMatrix(int[][] mat) {
4        int m = mat.length, n = mat[0].length; // The distance of cells is up to (M+N)
5        Queue<int[]> q = new ArrayDeque<>();
6        for (int r = 0; r < m; ++r)
7            for (int c = 0; c < n; ++c)
8                if (mat[r][c] == 0) q.offer(new int[]{r, c});
9                else mat[r][c] = -1; // Marked as not processed yet!
10
11        while (!q.isEmpty()) {
12            int[] curr = q.poll();
13            int r = curr[0], c = curr[1];
14            for (int i = 0; i < 4; ++i) {
15                int nr = r + DIR[i], nc = c + DIR[i+1];
16                if (nr < 0 || nr == m || nc < 0 || nc == n || mat[nr][nc] != -1) continue;
17                mat[nr][nc] = mat[r][c] + 1;
18                q.offer(new int[]{nr, nc});
19            }
20        }
21        return mat;
22    }
23}