// Last updated: 8/30/2026, 5:16:13 PM
1import java.util.PriorityQueue;
2
3class Solution {
4    public int trapRainWater(int[][] height) {
5        int n = height.length;
6        int m = height[0].length;
7
8        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
9        boolean[][] vis = new boolean[n][m];
10
11        for (int i = 0; i < n; i++) {
12            vis[i][0] = true;
13            vis[i][m - 1] = true;
14            pq.offer(new int[]{height[i][0], i, 0});
15            pq.offer(new int[]{height[i][m - 1], i, m - 1});
16        }
17
18        for (int i = 0; i < m; i++) {
19            vis[0][i] = true;
20            vis[n - 1][i] = true;
21            pq.offer(new int[]{height[0][i], 0, i});
22            pq.offer(new int[]{height[n - 1][i], n - 1, i});
23        }
24
25        int ans = 0;
26        int[] dr = {-1, 0, 1, 0};
27        int[] dc = {0, -1, 0, 1};
28
29        while (!pq.isEmpty()) {
30            int[] curr = pq.poll();
31            int h = curr[0], r = curr[1], c = curr[2];
32
33            for (int i = 0; i < 4; i++) {
34                int nr = r + dr[i];
35                int nc = c + dc[i];
36
37                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc]) {
38                    ans += Math.max(0, h - height[nr][nc]);
39                    pq.offer(new int[]{Math.max(h, height[nr][nc]), nr, nc});
40                    vis[nr][nc] = true;
41                }
42            }
43        }
44
45        return ans;
46    }
47}