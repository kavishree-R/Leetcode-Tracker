// Last updated: 9/16/2026, 2:07:00 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        if (m * n != r * c) return mat;
7
8        int[][] reshaped = new int[r][c];
9        int count = 0;
10
11        for (int i = 0; i < m; i++) {
12            for (int j = 0; j < n; j++) {
13                reshaped[count / c][count % c] = mat[i][j];
14                count++;
15            }
16        }
17
18        return reshaped;
19    }
20}