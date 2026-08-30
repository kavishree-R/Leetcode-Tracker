// Last updated: 8/30/2026, 5:05:59 PM
1class Solution {
2    public int maxSubarraySumCircular(int[] A) {
3        if(A.length == 0) return 0;
4        int sum = A[0];
5        int maxSoFar = A[0];
6        int maxTotal = A[0];
7        int minTotal = A[0];
8        int minSoFar = A[0];
9        for(int i = 1; i < A.length; i++){
10            int num = A[i];
11            maxSoFar = Math.max(num, maxSoFar + num);
12            maxTotal = Math.max(maxSoFar, maxTotal);
13            
14            minSoFar = Math.min(num, minSoFar + num);
15            minTotal = Math.min(minTotal, minSoFar);
16            
17            sum += num;
18        }
19        if(sum == minTotal) return maxTotal;
20        return Math.max(sum - minTotal, maxTotal);
21    }
22}
23