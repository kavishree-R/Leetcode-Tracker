// Last updated: 7/9/2026, 3:11:37 PM
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1' && !vis[i][j]) {
                    ans++;
                    bfs(i, j, vis, grid, m, n);
                }
            }
        }
        return ans;
    }
    void bfs(int row, int col, boolean[][] vis, char[][] grid, int m, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{row, col});
        vis[row][col] = true;
        int[][] dir = { {-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            for (int k = 0; k < 4; k++) {
                int nextRow = x + dir[k][0];
                int nextCol = y + dir[k][1];
                if (nextRow >= 0 && nextRow < m &&
                    nextCol >= 0 && nextCol < n &&
                    grid[nextRow][nextCol] == '1' &&
                    !vis[nextRow][nextCol]) {
                    vis[nextRow][nextCol] = true;
                    q.offer(new int[]{nextRow, nextCol});
               }

            }
        }

    }
}