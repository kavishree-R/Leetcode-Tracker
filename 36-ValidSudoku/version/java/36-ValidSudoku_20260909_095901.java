// Last updated: 9/9/2026, 9:59:01 AM
1class Solution {
2
3    private boolean isValid(char[][] board, int row, int col, char ch) {
4
5        for (int k = 0; k < 9; k++) {
6
7            // Check row
8            if (board[row][k] == ch && k != col)
9                return false;
10
11            // Check column
12            if (board[k][col] == ch && k != row)
13                return false;
14
15            // Check 3 x 3 box
16            int d1 = 3 * (row / 3) + (k / 3);
17            int d2 = 3 * (col / 3) + (k % 3);
18
19            if (board[d1][d2] == ch && (d1 != row || d2 != col))
20                return false;
21        }
22
23        return true;
24    }
25
26    public boolean isValidSudoku(char[][] board) {
27
28        for (int i = 0; i < board.length; i++) {
29
30            for (int j = 0; j < board.length; j++) {
31
32                if (board[i][j] != '.') {
33
34                    if (!isValid(board, i, j, board[i][j]))
35                        return false;
36                }
37            }
38        }
39
40        return true;
41    }
42}