// Last updated: 9/15/2026, 7:04:09 PM
1class Solution {
2     static public int findKthNumber(int n, int K) {
3        long k = K;
4        int ans = solve(0, n, k);
5        return ans;
6    }
7
8    static int solve(long current, long n, long k) {
9        if(k == 0) 
10             return (int) (current / 10);
11
12        for (long i = Math.max(current, 1); i < current + 10; i++) {
13            long count = numOfChildren(i, i + 1, n);
14            if (count >= k) 
15                return solve(i * 10, n, k - 1);
16            k-= count;
17        }
18
19        return -1;
20    }
21
22    static long numOfChildren(long current, long neighbour, long n) {
23        if (neighbour > n) {
24            if (current > n) return 0;
25            return n - current + 1;
26        }
27        return neighbour - current + numOfChildren(current * 10, neighbour * 10, n);
28    }
29}