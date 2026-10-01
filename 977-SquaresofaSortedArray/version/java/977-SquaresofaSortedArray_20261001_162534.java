// Last updated: 10/1/2026, 4:25:34 PM
1class Solution {
2    public int[] sortedSquares(int[] A) {
3        int n = A.length;
4        int[] result = new int[n];
5        int i = 0, j = n - 1;
6        for (int p = n - 1; p >= 0; p--) {
7            if (Math.abs(A[i]) > Math.abs(A[j])) {
8                result[p] = A[i] * A[i];
9                i++;
10            } else {
11                result[p] = A[j] * A[j];
12                j--;
13            }
14        }
15        return result;
16    }
17}