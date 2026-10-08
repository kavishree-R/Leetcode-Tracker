// Last updated: 10/8/2026, 9:35:18 AM
1class Solution {
2    public int[] beautifulArray(int N) {
3        int[] res = new int[N];
4        if (N == 1) 
5        {
6            return new int[] {1};
7        }
8        else if (N == 2) 
9        {
10            return new int[] {1, 2};
11        }
12        else
13        {
14            int[] odds = beautifulArray((N + 1) / 2);
15            int[] even = beautifulArray(N / 2);
16            for (int i = 0; i < odds.length; i ++) 
17            {
18                res[i] = odds[i] * 2 - 1;
19            }
20            for (int j = 0; j < even.length; j ++) 
21            {
22                res[odds.length + j] = even[j] * 2;
23            }
24        }
25        return res;
26    }
27}