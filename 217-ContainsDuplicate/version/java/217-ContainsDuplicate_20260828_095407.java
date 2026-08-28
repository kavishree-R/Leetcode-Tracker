// Last updated: 8/28/2026, 9:54:07 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int i = 0;
4        int j = matrix[0].length - 1;
5        
6        while(i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length){
7            if(matrix[i][j] == target) return true;
8            else if(matrix[i][j] > target) j--;
9            else if(matrix[i][j] < target) i++;
10        }
11        return false;
12    }
13}